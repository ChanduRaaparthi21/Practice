package com.chandu.spring.hibernate2.Dao;

import java.util.List;

import com.chandu.spring.hibernate2.entities.Student;

public interface StudentDao {
	
	public void save(Student student);
	public void update(Student student);
	public void delete(Student student);
	public Student findById(int id);
	public List<Student> findAll();

}
