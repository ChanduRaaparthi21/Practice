package com.secure.SpringSecurity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import com.secure.SpringSecurity.model.User;
import com.secure.SpringSecurity.service.JwtService;
import com.secure.SpringSecurity.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService service;
    
    @Autowired
    private AuthenticationManager manager;
    
    @Autowired
    private JwtService jwtService;

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return service.register(user);
    }

    @GetMapping("/welcome")
    public String welcome(Authentication authentication) {
        if (authentication == null || !authentication.isAuthenticated()) {
            return "❌ Not logged in!";
        }
        String username = authentication.getName();
        String role = authentication.getAuthorities().toString();
        return "🎉 Welcome, " + username + "! Your role: " + role;
    }
    
    
    @PostMapping("/login")
    public String login(@RequestBody User user) {
    	
    		Authentication authentication = manager
    				.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));
    	if(authentication.isAuthenticated()) {
    		return jwtService.generateToken(user.getUsername());
    				
    	}else {
    		return "fail";
    	}
    }
    
}
