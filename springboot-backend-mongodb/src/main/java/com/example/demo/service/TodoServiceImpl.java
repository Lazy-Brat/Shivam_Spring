package com.example.demo.service;

import java.util.Date;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.exception.TodoCollectionException;
import com.example.demo.model.TodoDTO;
import com.example.demo.repository.TodoRepository;

import jakarta.validation.ConstraintViolationException;

@Service
public class TodoServiceImpl implements TodoService {
	
	
	private TodoRepository todoRepo;
	
	@Override
	public void createTodo(TodoDTO todo) throws ConstraintViolationException, TodoCollectionException {
		Optional<TodoDTO> todoOptional = todoRepo.findByTodo(todo.getTodo());
		if (todoOptional.isPresent()) {
			throw new TodoCollectionException(TodoCollectionException.TodoAlreadyExists());
			
		}
		else {
			todo.setCreatedAt(new Date(System.currentTimeMillis()));
		}
		
	}
	

}
