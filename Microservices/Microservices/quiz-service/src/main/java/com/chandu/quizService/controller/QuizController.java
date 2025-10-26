package com.chandu.quizService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.chandu.quizService.model.QuestionWrapper;
import com.chandu.quizService.model.QuizDto;
import com.chandu.quizService.model.Response;
import com.chandu.quizService.service.QuizService;

@RestController
@RequestMapping("quiz")
public class QuizController {
	
	@Autowired
	QuizService quizService;
	
//	@PostMapping("create")
//	public ResponseEntity<String> createQuiz(@RequestBody QuizDto quizDto){
//
//		return quizService.createQuiz(quizDto.getCategoryName(), quizDto.getNumOfQuestions(), quizDto.getTitle());
//
//	}
@PostMapping("create")
public ResponseEntity<String> createQuiz(@RequestBody QuizDto quizDto) {
	System.out.println("Category: " + quizDto.getCategoryName());
	System.out.println("Number of Questions: " + quizDto.getNumOfQuestions());
	System.out.println("Title: " + quizDto.getTitle());

	return quizService.createQuiz(quizDto.getCategoryName(), quizDto.getNumOfQuestions(), quizDto.getTitle());
}



	@GetMapping("get/{id}")
	public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(@PathVariable Integer id){
		return quizService.getQuizQuestions(id);  		
		
	}
	
	@PostMapping("submit/{id}")
	public ResponseEntity<Integer> submitQuiz(@PathVariable Integer id, @RequestBody List<Response> responses) {
		//TODO: process POST request
		
		return quizService.calculateResult(id, responses); 
	}
	

}
