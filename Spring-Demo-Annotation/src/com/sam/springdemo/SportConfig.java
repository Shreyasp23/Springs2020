package com.sam.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.sam.springdemo")
@PropertySource("classpath:sport.properties"
		+ "")
public class SportConfig {
	
	@Bean
	public FortuneService goodLuckFortuneService() {
		return new GoodLuckFortuneService();
	} 
	
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(goodLuckFortuneService());
		
	}
	
	
}
