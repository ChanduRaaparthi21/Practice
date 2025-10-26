package com.chandu.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class HelloController {

	@GetMapping("hello")
	public String greet(HttpServletRequest req) {
		return "Hello";
	}
	
	@GetMapping("about")
	public String about(HttpServletRequest req) {
		return "Chandu"+req.getSession().getId();
	}
	
}
