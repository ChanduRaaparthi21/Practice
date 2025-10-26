package com.chandu.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.chandu.Dao.QuestionDao;
import com.chandu.Dao.QuizDao;
import com.chandu.Model.Question;
import com.chandu.Model.QuestionWrapper;
import com.chandu.Model.Quiz;
import com.chandu.Model.Response;


@Service
public class QuizService {
	
	@Autowired
	QuizDao quizDao;
	
	@Autowired
	QuestionDao questionDao;

	public ResponseEntity<String> createQuiz(String category, int numQ, String title) {
		
		List<Question> questions = questionDao.findRandomQuestionsByCategory(category, numQ);
		
		
		Quiz  quiz = new Quiz();
		quiz.setTitle(title);
		quiz.setQuestions(questions);
		quizDao.save(quiz);
		
		return new ResponseEntity<>("sccess",HttpStatus.CREATED);
	}

	public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(Integer id) {
		
	Optional<Quiz> quiz=	quizDao.findById(id);
	List<Question> questionFromDB=quiz.get().getQuestions();
	
	List<QuestionWrapper> questionForUsers = new ArrayList<>();
	
	for(Question q : questionFromDB) {
		
		QuestionWrapper qw = new QuestionWrapper(q.getId(), q.getQuestionTitle(), q.getOption1(), q.getOption2(), q.getOption3(), q.getOption4());
		questionForUsers.add(qw);
	}
	
	
	return new ResponseEntity<>(questionForUsers,HttpStatus.OK);
	}

	public ResponseEntity<Integer> calculateResult(Integer id, List<Response> responses) {
	    Quiz quiz = quizDao.findById(id).get();
	    List<Question> questions = quiz.getQuestions();

	    int right = 0;

	    // Iterate through responses and match each with the corresponding question by id
	    for (Response response : responses) {
	        for (Question question : questions) {
	            if (response.getId().equals(question.getId()) && response.getResponse().equals(question.getRightAnswer())) {
	                right++;
	                break; // No need to check other questions for the same response
	            }
	        }
	    }

	    return new ResponseEntity<>(right, HttpStatus.OK);
	}

	
	
	

}
