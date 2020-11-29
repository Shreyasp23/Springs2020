package com.sam.aopdemo;

import java.util.logging.Logger;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sam.aopdemo.service.TrafficFortuneService;

public class AroundDemoAppWithLogger {

	private static Logger logger = Logger.getLogger(AroundDemoAppWithLogger.class.getName());
	
	public static void main(String[] args) {
	
		
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		TrafficFortuneService service = context.getBean("trafficFortuneService",TrafficFortuneService.class);
		
		service.getFortune();
		
		logger.info("Back to main menu");
		
		context.close();

	}

}
