package com.sam.springboot.demo.MyBootApp.rest;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

	@Value("${user.name}")
	private String name;
	@Value("${user.gender}")
	private String gender;
	
	@GetMapping("/")
	public String Hellow() {
		
		return "Hellow Spring Booot" + LocalDateTime.now();
	}
	
	@GetMapping("/test")
	public String HellowTest() {
		
		return "Hellow Spring Booot test!" + LocalDateTime.now() +" "+name+" "+gender;
	}

	
}
