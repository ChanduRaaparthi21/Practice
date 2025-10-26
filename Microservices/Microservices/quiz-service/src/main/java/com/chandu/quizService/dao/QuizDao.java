package com.chandu.quizService.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chandu.quizService.model.Quiz;

public interface QuizDao extends JpaRepository<Quiz, Integer> {

}
