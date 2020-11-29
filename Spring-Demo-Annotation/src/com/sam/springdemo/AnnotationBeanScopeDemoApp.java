package com.sam.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach tc = context.getBean("tennisCoach",Coach.class);
		Coach tc1 = context.getBean("tennisCoach",Coach.class);
		System.out.println("tc>>"+tc+" tc1"+tc1);
		
		context.close();
	}

}
