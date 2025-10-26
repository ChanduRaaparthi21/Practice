package com.chandu.questionService.dao;

import java.util.List;

import org.aspectj.weaver.tools.Trace;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.chandu.questionService.model.Question;


@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> {



	List<Question> findByCategory(String category);

	@Query(value = "SELECT q.id FROM question q WHERE q.category = :categoryName ORDER BY RANDOM() LIMIT :numQ", nativeQuery = true)
	List<Integer> findRandomQuestionsByCategory(String categoryName, int numQ);


	

	

	
	
}
