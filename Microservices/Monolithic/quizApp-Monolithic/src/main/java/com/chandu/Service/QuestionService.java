package com.chandu.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.chandu.Dao.QuestionDao;
import com.chandu.Model.Question;

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

}
