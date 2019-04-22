package com.brighten.banana.todo.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingMessageServiceImpl implements GreetingMessageService {

	public String greetUser() {
		return "Welcome to Learning Spring Application Development";
	}
	
}
