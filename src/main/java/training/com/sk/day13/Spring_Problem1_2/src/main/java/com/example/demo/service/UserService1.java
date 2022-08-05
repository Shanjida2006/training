package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.UserRepository;

@Service
public class UserService1 implements UserService{
	
	//Field Based Injection by Type
	UserRepository userRepository;
	@Autowired
	UserService1(UserRepository userRepository){
		System.out.println("From Service: (Constructor Insection)");
		this.userRepository = userRepository;
	}
}
