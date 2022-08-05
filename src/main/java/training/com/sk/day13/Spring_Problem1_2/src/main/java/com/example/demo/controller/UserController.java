package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.UserService;

@RestController
public class UserController {
	
	//Injection by Qualifier
	@Autowired
	@Qualifier("userService1")
	UserService userService;
    
	//Field based Injection by Name
    @Autowired
    UserService userService1;
    
    @Autowired
    UserService userService2;
	
	//Constructor Based Injection
	@Autowired
	UserController(UserService userService1) {
		System.out.println("From Controller: (Constructor Insection)");
		this.userService1 = userService1;
	}
	
	//Setter Based Injection
	@Autowired
	public void setUserService(UserService userService1) {
		System.out.println("From Controller: (Setter Injection)");
		this.userService1 = userService1;
	}
	
	//@GetMapping("/test")
	//public void getUsers() {
		//userService2.getUsers(); 
	//}
}
