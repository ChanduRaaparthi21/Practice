package com.chandu.spring.hibernate2.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.chandu.spring.hibernate2.entities.Student;

@Component
public class StudentDaoImpl implements StudentDao {

	 @Autowired
	 private HibernateTemplate hibernateTemplate;

	 @Transactional(readOnly = false)
	public void save(Student student) {
     hibernateTemplate.save(student);		
	}

	 @Transactional(readOnly = false)
	public void update(Student student) {
     hibernateTemplate.update(student);		
	}

	 @Transactional(readOnly = false)
	public void delete(Student student) {
		hibernateTemplate.delete(student);
		
	}

	public Student findById(int id) {
		// TODO Auto-generated method stub
		return hibernateTemplate.get(Student.class, id);
	}

	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return hibernateTemplate.loadAll(Student.class);
	}
	
}
