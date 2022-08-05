package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.UserRepository;

@Service
public class UserService2 implements UserService{
	
	@Autowired
	UserRepository userRepository;
	
	public void getUsers() {
		System.out.println("From Service 2");
	}

}
