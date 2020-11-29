package com.sam.aopdemo.service;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;

@Component
public class TrafficFortuneService {
	
	public String getFortune(boolean b) {
		if(b==false) {
			throw new RuntimeException("<--------------------- Major Exception -------------------->");
		}
		
		try {
			TimeUnit.SECONDS.sleep(12);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "Heavy Traffic";
	}
}
