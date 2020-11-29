package com.sam.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		SwimCoach tc = context.getBean("swimCoach",SwimCoach.class);
		
		System.out.println("Fortun is"+ tc.getFortune());
		System.out.println("values are "+tc.getName()+tc.getEmailId());
		
		context.close();
	}

}
