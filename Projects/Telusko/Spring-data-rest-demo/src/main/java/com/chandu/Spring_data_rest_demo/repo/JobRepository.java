package com.chandu.Spring_data_rest_demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chandu.Spring_data_rest_demo.model.Job;

import java.util.List;

@Repository
public interface JobRepository extends JpaRepository<Job, Integer>{	
	
//	List<Job> findByPostProfileContainingOrPostDescContaining(String postProfile, String postDesc);
	
}

