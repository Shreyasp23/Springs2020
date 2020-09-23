package com.sam.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		TennisCoach tCoach =context.getBean("tennisCoach",TennisCoach.class);
		System.out.println(tCoach.getDailyWorkOut());
		System.out.println(tCoach.getFortune());
		System.out.println(tCoach.getName()+" "+tCoach.getEmail());
		
		context.close();

	}

}
