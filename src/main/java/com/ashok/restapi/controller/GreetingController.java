package com.ashok.restapi.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ashok.restapi.model.Greeting;
import com.ashok.restapi.service.GreetingService;

@RestController
public class GreetingController {
	
	
	@Autowired
	private GreetingService greetingService;
	
	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return greetingService.getGreeting(name);
	}

}