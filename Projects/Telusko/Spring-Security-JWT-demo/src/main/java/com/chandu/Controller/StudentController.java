package com.chandu.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.chandu.model.Student;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class StudentController {

	List<Student> students = new ArrayList<Student>(List.of(
			new Student(1,"chandu","Java"),
			new Student(2,"sai","Cloud"),
			new Student(3,"appu","Python")
			
			));
	
	@GetMapping("students")
	public List<Student> getstudents(){
		return students;
	}
	

	@PostMapping("students")
	public void addStudent(@RequestBody Student student) {
		students.add(student);
	}
	
	@GetMapping("csrf-token")
	public CsrfToken getCsrfToken(HttpServletRequest request) {
		
		return (CsrfToken) request.getAttribute("_csrf");
		
	}
}

