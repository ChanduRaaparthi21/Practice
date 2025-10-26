package com.chandu.quizService.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import feign.FeignException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.chandu.quizService.dao.QuizDao;
import com.chandu.quizService.feign.Quizinterface;
import com.chandu.quizService.model.QuestionWrapper;
import com.chandu.quizService.model.Quiz;
import com.chandu.quizService.model.Response;


@Service
public class QuizService {
	
	@Autowired
	QuizDao quizDao;
	
	@Autowired
    Quizinterface  quizinterface;

//	public ResponseEntity<String> createQuiz(String category, int numQ, String title) {
//
//		List<Integer> questions = quizinterface.getQuestionsForQuiz(category, numQ).getBody();
//		Quiz quiz = new Quiz();
//		quiz.setTitle(title);
//		quiz.setQuestionsIds(questions);
//		quizDao.save(quiz);
//
//
//		return new ResponseEntity<>("Success",HttpStatus.CREATED);
//	}

	public ResponseEntity<String> createQuiz(String category, int numQ, String title) {
		try {
			List<Integer> questions = quizinterface.getQuestionsForQuiz(category, numQ).getBody();
			if (questions == null || questions.isEmpty()) {
				return new ResponseEntity<>("No questions found", HttpStatus.INTERNAL_SERVER_ERROR);
			}
			Quiz quiz = new Quiz();
			quiz.setTitle(title);
			quiz.setQuestionsIds(questions);
			quizDao.save(quiz);

			return new ResponseEntity<>("Quiz created successfully", HttpStatus.CREATED);
		} catch (FeignException e) {
			// Log the specific error for debugging
			System.out.println("FeignException occurred: " + e.getMessage());
			return new ResponseEntity<>("Error while creating quiz", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}






	public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(Integer id) {

	Quiz quiz=	quizDao.findById(id).get();
		List<Integer> questionIds = quiz.getQuestionsIds();
		ResponseEntity<List<QuestionWrapper>> questions = quizinterface.getQuestionsFromId(questionIds);

	return questions;
	}

	public ResponseEntity<Integer> calculateResult(Integer id, List<Response> responses) {

		ResponseEntity<Integer> score = quizinterface.getScore(responses);

	    return score;
	}





}
