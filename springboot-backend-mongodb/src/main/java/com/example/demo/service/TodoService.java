package com.example.demo.service;

import com.example.demo.exception.TodoCollectionException;
import com.example.demo.model.TodoDTO;

import jakarta.validation.ConstraintViolationException;

public interface TodoService {
	
	public void createTodo(TodoDTO todo) throws ConstraintViolationException, TodoCollectionException ;

}
