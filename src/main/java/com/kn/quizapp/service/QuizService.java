package com.kn.quizapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.kn.quizapp.dao.QuizDao;

@Service
public class QuizService {

	@Autowired
	QuizDao quizDao;
	
	public ResponseEntity<String> createQuiz(String category, Integer numQ, String title) {
		// TODO Auto-generated method stub
		return null;
	}

}
