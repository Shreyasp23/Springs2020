package com.sam.springboot.cruddemo.dao;

import java.util.List;

import com.sam.springboot.cruddemo.entity.Employee;

public interface EmployeeDAO {

	public List<Employee> findAll();
	
	public Employee findById(int id);
	
	public Employee save(Employee theEmployee);
	
	public Employee saveOrUpdate(Employee theEmployee);
	
	public int delete(int id);
}
