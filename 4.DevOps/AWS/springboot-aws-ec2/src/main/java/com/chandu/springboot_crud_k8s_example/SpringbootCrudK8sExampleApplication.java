package com.chandu.springboot_crud_k8s_example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootCrudK8sExampleApplication {

	@GetMapping("/hi")
	public String Hi(){
		return "Hi";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCrudK8sExampleApplication.class, args);
	}

}
