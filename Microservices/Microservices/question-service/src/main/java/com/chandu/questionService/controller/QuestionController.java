package com.chandu.questionService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.chandu.questionService.model.Question;
import com.chandu.questionService.model.QuestionWrapper;
import com.chandu.questionService.model.Response;
import com.chandu.questionService.service.QuestionService;



@RestController
@RequestMapping("question")
public class QuestionController {
    @Autowired
    QuestionService questionService;

    @GetMapping("allQuestions")
    public  ResponseEntity<List<Question>> getAllQuestions() {
    	return questionService.getAllQuestions();
    }
    
    @GetMapping("/category/{category}")
    public ResponseEntity<List<Question>> getQuestionsByCategory(@PathVariable String category) {
        return questionService.findByCategory(category);
    }
    
    @PostMapping("/add")
    public ResponseEntity<Question> addQuestion(@RequestBody Question question) {
        return questionService.addQuestion(question);	
      
    }
    
    @DeleteMapping("/delete/{id}")
    public void deleteQuestion(@PathVariable int id) {
    	questionService.deleteQuestion(id);
    }
    
    
    @PutMapping("/update/{id}")
    public ResponseEntity<Question> updateQuestion(@RequestBody Question question) {
        Question savedQuestion = questionService.updateQuestion(question);	
        return ResponseEntity.ok(savedQuestion);
    }
    
    @GetMapping("generate")
    public ResponseEntity<List<Integer>> getQuestionsForQuiz
    (@RequestParam String categoryName, @RequestParam Integer numOfQuestions){
    	return questionService.getQuestionsForQuiz(categoryName, numOfQuestions);
    }
    
    
    @PostMapping("getQuestions")
    public ResponseEntity<List<QuestionWrapper>> getQuestionsFromId(@RequestBody List<Integer> questionIds){
    	
    	return questionService.getQuestionsFromId(questionIds);
    }
    
    
    
    @PostMapping("getScore")
    public ResponseEntity<Integer> getScore(@RequestBody List<Response> responses){
    	
    	return questionService.getScore(responses);
    	
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
