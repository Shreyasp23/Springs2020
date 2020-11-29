package com.sam.aopdemo;

import java.util.logging.Logger;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sam.aopdemo.service.TrafficFortuneService;

public class AroundDemoAppWithException {

	private static Logger logger = Logger.getLogger(AroundDemoAppWithException.class.getName());
	
	public static void main(String[] args) {
	
		
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		TrafficFortuneService service = context.getBean("trafficFortuneService",TrafficFortuneService.class);
		
		Object res=service.getFortune(false);
		
		logger.info("Back to main menu=======>"+res);
		
		context.close();

	}

}
