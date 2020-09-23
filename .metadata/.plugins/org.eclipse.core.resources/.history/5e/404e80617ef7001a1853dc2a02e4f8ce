package com.code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach criCoach = context.getBean("myCricketCoach",CricketCoach.class);
		System.out.println(criCoach.getFortune());
		System.out.println(criCoach.getDailyWorkOut());
		context.close();
	}

}
