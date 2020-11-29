package com.sam.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sam.aopdemo.service.TrafficFortuneService;

public class AroundDemoApp {

	public static void main(String[] args) {
	
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		TrafficFortuneService service = context.getBean("trafficFortuneService",TrafficFortuneService.class);
		
		service.getFortune();
		
		System.out.println("Back to main menu");
		
		context.close();

	}

}
