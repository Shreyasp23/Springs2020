package com.sam.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	/*@Autowired
	@Qualifier("Mini")*/
	FortuneService fortuneService;
	
	@Value("${foo.name}")
	private String name;
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	@Value("${foo.email}")
	private String email;
	
	@Autowired
	public TennisCoach(@Qualifier("Mini") FortuneService fortuneService) {
		System.out.println("Inside Tennis Coach autowired constructor");
		this.fortuneService=fortuneService;
	}
	
	
	public TennisCoach() {
		System.out.println("Inside Tennis Coach Constructor");
	}
	
	/*@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside Tennis Coach setFortuneService");
		this.fortuneService=fortuneService;
	}*/
	
	
	
	@Override
	public String getDailyWorkOut() {
		
		return "Practice your backend volley";
	}
	
	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}

}
