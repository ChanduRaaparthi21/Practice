package com.chandu.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chandu.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

	List<Student> findByName(String name);
	
	List<Student> findByMarks(int num);
	
}
