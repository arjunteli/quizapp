package com.kn.quizapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kn.quizapp.model.Quiz;

public interface QuizDao extends JpaRepository<Quiz, Integer>{
	
}
