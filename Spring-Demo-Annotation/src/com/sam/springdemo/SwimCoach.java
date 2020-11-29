package com.sam.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {

	FortuneService fortuneService;
	@Value("${foo.name:Shreyas}")
	public String name;
	@Value("${foo.email}")
	public String emailId;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public  SwimCoach(FortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}
	
	public  SwimCoach() {
		
	}

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "SWIM 1000 LAPS";
	}

	@Override
	public String getFortune() {
		
		return fortuneService.getFortune();
	}

}
