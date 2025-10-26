package com.chandu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
	
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	
	@RequestMapping("addStudents")
	public String addStudents(Student student) {
		return "studentResult";
	}
	
	

}
