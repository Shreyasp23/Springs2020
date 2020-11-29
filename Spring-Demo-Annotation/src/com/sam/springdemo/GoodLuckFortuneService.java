package com.sam.springdemo;

import org.springframework.stereotype.Component;


public class GoodLuckFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "YOU WILL WIN";
	}

}
