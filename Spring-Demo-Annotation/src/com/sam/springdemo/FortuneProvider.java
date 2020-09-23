package com.sam.springdemo;

import org.springframework.stereotype.Component;

@Component
public class FortuneProvider implements FortuneService {

	@Override
	public String getFortune() {
		
		return "Good Days Ahead Buddy";
	}

}
