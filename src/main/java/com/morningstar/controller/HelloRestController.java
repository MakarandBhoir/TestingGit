package com.morningstar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="hello")
public class HelloRestController {
	// http://localhost:9090/hello/welcome
	@GetMapping(path="welcome")
	public String hello() {
		return "Welcome To Spring Rest!";
	}
	
	// http://localhost:9090/hello/user
	@GetMapping(path="user")
	public User getUser() {
		User user = new User("Makarand", "Bhoir");
		return user;
	}
}
