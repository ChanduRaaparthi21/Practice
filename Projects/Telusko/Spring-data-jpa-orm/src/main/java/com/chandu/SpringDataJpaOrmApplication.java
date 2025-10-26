package com.chandu;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.chandu.Repo.StudentRepo;
import com.chandu.model.Student;

@SpringBootApplication
public class SpringDataJpaOrmApplication {

	public static void main(String[] args) {
		
		
		
		ApplicationContext context =  SpringApplication.run(SpringDataJpaOrmApplication.class, args);
		StudentRepo repo = context.getBean(StudentRepo.class);
		
		Student s1 =context.getBean(Student.class);
		Student s2 =context.getBean(Student.class);
		Student s3 =context.getBean(Student.class);
		
		
		//save the data into db
//		s1.setRollNo(101);
//		s1.setName("Chandu");
//		s1.setMarks(35);
//		
//		
		s2.setRollNo(102);
		s2.setName("sai");
		s2.setMarks(79);
		
//		
		s3.setRollNo(104);
		s3.setName("laddu");
		s3.setMarks(1002);
		
//		repo.save(s1);
//		repo.save(s2);
//		repo.save(s3);
		
		
		//retrieving the data from db
//		System.out.println(repo.findAll());
//		
//		
//		Optional<Student> s = repo.findById(102);
//		
//		System.out.println(s.orElse(new Student()));
		
		//find by name
//		System.out.println(repo.findByName("apu"));
		
		//findbyMarks
//		System.out.println(repo.findByMarks(79));
		
		//update
		
//		repo.save(s3);
		
		//delete
		repo.delete(s2);

		

		
		
	}

}
