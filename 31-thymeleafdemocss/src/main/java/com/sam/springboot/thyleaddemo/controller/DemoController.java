package com.sam.springboot.thyleaddemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {
	
	@RequestMapping("/hello")
	public String hello(Model theModel) {
		theModel.addAttribute("theDate" ,new java.util.Date());
		return "hello";
	}
}
