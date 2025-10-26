package com.chandu.forkuberneets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ForkuberneetsApplication {


	@GetMapping("/hi")
	public String Hi(){
		return "Hi";

	}

	public static void main(String[] args) {
		SpringApplication.run(ForkuberneetsApplication.class, args);
	}

}
