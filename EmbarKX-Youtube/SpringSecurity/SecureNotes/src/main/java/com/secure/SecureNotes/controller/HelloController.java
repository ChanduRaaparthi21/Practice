package com.secure.SecureNotes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	
	@GetMapping("/Hello")
	public String Hello() {
		return "Hello";
	}
	
}
