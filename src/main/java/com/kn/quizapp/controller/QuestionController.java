package com.kn.quizapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kn.quizapp.model.Question;
import com.kn.quizapp.service.QuestionService;

@RestController
@RequestMapping("question")
public class QuestionController {

	@Autowired
	QuestionService questionService;

	// http://localhost:8080/question/allQuestions
	@GetMapping("allQuestions")
	public ResponseEntity<List<Question>> getAllQuestions() {

		return questionService.getAllQuestion();

	}

	// http://localhost:8080/question/category/(Java Python)
	@GetMapping("category/{category}")
	public ResponseEntity<List<Question>> getQuestionsByCategory(@PathVariable("category") String category) {

		return questionService.getQuestionsByCategory(category);

	}

	// http://localhost:8080/question/add
	@PostMapping("add")
	public ResponseEntity<String> addQuestion(@RequestBody Question question) {

		return questionService.addQuestion(question);

	}

}
