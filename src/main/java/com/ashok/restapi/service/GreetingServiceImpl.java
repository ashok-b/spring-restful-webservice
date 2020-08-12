package com.ashok.restapi.service;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Service;

import com.ashok.restapi.model.Greeting;

@Service
public class GreetingServiceImpl implements GreetingService{

	private static final String template = "Hello %s";
	private final AtomicInteger counter =  new AtomicInteger();
	
	@Override
	public Greeting getGreeting(String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template,name));
	}

}
