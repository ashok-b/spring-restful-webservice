package com.ashok.restapi.service.greeting.impl;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Service;

import com.ashok.restapi.model.Greeting;
import com.ashok.restapi.service.GreetingService;

@Service
public class GreetingServiceImpl implements GreetingService{

	private static final String template = "Hello %s";
	private final AtomicInteger counter =  new AtomicInteger();
	
	@Override
	public Greeting getGreeting(String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template,name));
	}

}
