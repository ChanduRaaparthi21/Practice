package com.chandu.springboot_docker_aws_ecs_codebuild;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootDockerAwsEcsCodebuildApplication {

	@GetMapping("/")
    public String hello() {
        return "Hello this is last time to check it working or not, World! This is a Dockerized Spring Boot application running on AWS ECS using CodeBuild!";
    }

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDockerAwsEcsCodebuildApplication.class, args);
	}

}
