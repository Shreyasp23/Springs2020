package com.code.springdemo;

public class CricketCoach implements Coach {
	FortuneService fortuneService;
	
	public CricketCoach() {
		System.out.println("CricketCoach: No-arg constructor");
	}

	public void setfortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: Inside setfortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		
		return "Do net practice";
	}

	@Override
	public String getFortune() {

		return fortuneService.getFortune();
	}

}
