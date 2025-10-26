package com.chandu;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.chandu.Model.Student;
import com.chandu.Service.StudentService;

@SpringBootApplication
public class SpringJdbcExApplication {

	public static void main(String[] args) {
		
	ApplicationContext applicationContext=	SpringApplication.run(SpringJdbcExApplication.class, args);
	
	Student s = applicationContext.getBean(Student.class);
	s.setRollNo(108);
	s.setName("adds");
	s.setMarks(99);
	
	
	StudentService service = applicationContext.getBean(StudentService.class);
	
	service.addStudent(s);
	
	
	List<Student> students = service.getStudents();
	System.out.println(students);
	
	
	}

}
