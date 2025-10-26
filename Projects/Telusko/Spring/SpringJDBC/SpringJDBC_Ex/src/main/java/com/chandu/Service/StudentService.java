package com.chandu.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chandu.Model.Student;
import com.chandu.Repository.StudentRepo;

@Service
public class StudentService {

	
	private StudentRepo repo;
	
	
	public StudentRepo getRepo() {
		return repo;
	}
	@Autowired
	public void setRepo(StudentRepo repo) {
		this.repo = repo;
	}


	public void addStudent(Student s) {
		repo.save(s);
	}
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	
}
