package com.sam.springboot.cruddemo.service;

import java.util.List;

import com.sam.springboot.cruddemo.entity.Employee;

public interface EmployeeService {
	public List<Employee> findAll();
	
	public Employee findById(int id);
	
	public Employee save(Employee theEmployee);
	
	public void delete(int id);
}
