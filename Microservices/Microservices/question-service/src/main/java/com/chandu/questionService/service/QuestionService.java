package com.chandu.questionService.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.chandu.questionService.dao.QuestionDao;
import com.chandu.questionService.model.Question;
import com.chandu.questionService.model.QuestionWrapper;
import com.chandu.questionService.model.Response;

@Service
public class QuestionService {

	@Autowired
	QuestionDao dao;
	

	public ResponseEntity<List<Question>> getAllQuestions() {
		try {

			return new ResponseEntity<>(dao.findAll() ,HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<>(new ArrayList<>(),HttpStatus.BAD_REQUEST);
	      
	}


	public ResponseEntity<List<Question>> findByCategory(String category) {
		// TODO Auto-generated method stub
		try {
			return new ResponseEntity<>(dao.findByCategory(category), HttpStatus.OK);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
	}
	
	
	
	 public ResponseEntity<Question> addQuestion(Question question) {
	        try {
				return new ResponseEntity<>(dao.save(question),HttpStatus.CREATED);
			} catch (Exception e) {
				e.printStackTrace();
			}
	        return new ResponseEntity<>(null,HttpStatus.BAD_REQUEST);
	    }


	public void deleteQuestion(int id) {
		dao.deleteById(id);
		// TODO Auto-generated method stub
		
	}


	public Question updateQuestion(Question question) {
		// TODO Auto-generated method stub
		return dao.save(question);
	}


	public ResponseEntity<List<Integer>> getQuestionsForQuiz(String categoryName, Integer numOfQuestions) {
		List<Integer> questions = dao.findRandomQuestionsByCategory(categoryName, numOfQuestions);
		return new ResponseEntity<>(questions, HttpStatus.OK);
	}


	public ResponseEntity<List<QuestionWrapper>> getQuestionsFromId(List<Integer> questionIds) {
		
		List<QuestionWrapper> wrappers = new ArrayList<>();
		List<Question> questions = new ArrayList<>();
		
		for(Integer id : questionIds) {
			questions.add(dao.findById(id).get());
		}
		
		
		for(Question question : questions) {
			QuestionWrapper wrapper = new QuestionWrapper();
			wrapper.setId(question.getId());
			wrapper.setQuestionTitle(question.getQuestionTitle());
			wrapper.setOption1(question.getOption1());
			wrapper.setOption2(question.getOption2());
			wrapper.setOption3(question.getOption3());
			wrapper.setOption4(question.getOption4());
			
			
			wrappers.add(wrapper);
		}
		
		
		return new ResponseEntity<>(wrappers,HttpStatus.OK);
		
	}


	public ResponseEntity<Integer> getScore(List<Response> responses) {
		
		    int right = 0;

		    // Iterate through responses and match each with the corresponding question by id
		    for (Response response : responses) {
		    	Question question = dao.findById(response.getId()).get();
		        if(response.getResponse().equals(question.getRightAnswer())) {
		        	right++;
		        }
		    }

		    return new ResponseEntity<>(right, HttpStatus.OK);
	}

}
