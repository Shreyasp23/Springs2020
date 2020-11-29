package com.sam.springboot.thyleaddemo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sam.springboot.thyleaddemo.entity.Employee;

@Controller

public class DemoController {
	List<Employee> list= null;
	
	@PostConstruct
	public void load() {
		
		Employee e = new Employee("sam","ram","@gmaol");
		Employee e1 = new Employee("sam","ram","@gmaol");
		Employee e2 = new Employee("sam","ram","@gmaol");
		list = new ArrayList<Employee>();
		list.add(e);
		list.add(e1);
		list.add(e2);
	}
	
	@RequestMapping("/hello")
	public String hello(Model theModel) {
		theModel.addAttribute("theDate" ,new java.util.Date());
		return "hello";
	}
	
	@GetMapping("/employees")
	public String getEmployees(Model theModel) {
		
		
		theModel.addAttribute("employees",list);
		return "employee-list";
	}
}
