package com.sam.springdemo;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Mini")
public class FortuneProviderMini implements FortuneService {
	
	@Value("${foo.fortune}")
	private String[] values;
	
	
	@Override
	public String getFortune() {
		
		Random ran = new Random();
		
		
		return values[ran.nextInt(values.length)];
	}

}
