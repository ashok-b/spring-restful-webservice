package com.ashok.restapi.service;


import com.ashok.restapi.model.Greeting;


public interface GreetingService {
	
	Greeting getGreeting(String name);
}
