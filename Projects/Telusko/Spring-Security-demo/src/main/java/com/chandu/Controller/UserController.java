package com.chandu.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.chandu.Service.UserService;
import com.chandu.model.User;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;

	@PostMapping("register")
	public User register(@RequestBody User user) {
		
		return userService.saveUSer(user);
	}
	
}
