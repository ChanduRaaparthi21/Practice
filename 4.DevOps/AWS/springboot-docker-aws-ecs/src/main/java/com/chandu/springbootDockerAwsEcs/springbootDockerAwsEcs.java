package com.chandu.springbootDockerAwsEcs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class springbootDockerAwsEcs {

	@GetMapping("/hi")
	public String Hi(){
		return "Hi";
	}

	@GetMapping("/hi{name}")
	public String HiName(@PathVariable String name){
		return "Hi "+name;
	}


	public static void main(String[] args) {
		SpringApplication.run(springbootDockerAwsEcs.class, args);
	}

}
