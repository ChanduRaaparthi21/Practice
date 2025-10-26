package com.chandu.spring.hibernate2.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.chandu.spring.hibernate2.Dao.StudentDao;
import com.chandu.spring.hibernate2.entities.Student;

@Component
public class StudentBusinessImpl implements StudentBusiness {
	
	@Autowired
	private StudentDao studentDao;

	public void save(Student student) {
		studentDao.save(student);
		
	}

	public void update(Student student) {
		// TODO Auto-generated method stub
		studentDao.update(student);
		
	}

	public void delete(Student student) {
		// TODO Auto-generated method stub
		studentDao.delete(student);
		
	}

	public Student findById(int id) {
		// TODO Auto-generated method stub
		return studentDao.findById(id);
	}

	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return studentDao.findAll();
	}

}
