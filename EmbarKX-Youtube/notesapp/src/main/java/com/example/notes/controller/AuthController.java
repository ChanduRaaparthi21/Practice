package com.example.notes.controller;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.notes.model.Role;
import com.example.notes.model.User;
import com.example.notes.repository.UserRepository;
import com.example.notes.security.JwtUtil;

@RestController @RequestMapping("/api/auth")
public class AuthController {
  private final UserRepository userRepo; private final PasswordEncoder encoder;
  private final JwtUtil jwt; private final AuthenticationManager authManager;
  public AuthController(UserRepository ur, PasswordEncoder p, JwtUtil j, AuthenticationManager am){ this.userRepo=ur; this.encoder=p; this.jwt=j; this.authManager=am; }

  @PostMapping("/register")
  public ResponseEntity<?> register(@RequestBody Map<String,String> body){
    String u = body.get("username"), p = body.get("password");
    if(userRepo.findByUsername(u).isPresent()) return ResponseEntity.badRequest().body("username exists");
    userRepo.save(new User(u, encoder.encode(p), Role.ROLE_USER));
    return ResponseEntity.ok("registered");
  }

  @PostMapping("/login")
  public ResponseEntity<?> login(@RequestBody Map<String,String> body){
    authManager.authenticate(new UsernamePasswordAuthenticationToken(body.get("username"), body.get("password")));
    var user = userRepo.findByUsername(body.get("username")).orElseThrow();
    String token = jwt.generateToken(user.getUsername(), user.getRole().name());
    return ResponseEntity.ok(Map.of("token", token));
  }
}
