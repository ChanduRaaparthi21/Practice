package com.chandu.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.chandu.Service.jwtService;
import com.chandu.Service.UserService;
import com.chandu.model.User;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	AuthenticationManager manager;
	
	@Autowired
	jwtService jwtService;

	@PostMapping("register")
	public User register(@RequestBody User user) {
		
		return userService.saveUSer(user);
	}
	
	
	@PostMapping("login")
	public String login(@RequestBody User user) {
		
		Authentication authentication = manager
				.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));
		
		if(authentication.isAuthenticated()) {
			return jwtService.generateToken(user.getUsername());
		}else {
			return "login failed";
		}
		
	}
}
