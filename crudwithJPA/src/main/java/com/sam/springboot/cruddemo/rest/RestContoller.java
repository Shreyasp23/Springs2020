package com.sam.springboot.cruddemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sam.springboot.cruddemo.entity.Employee;
import com.sam.springboot.cruddemo.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class RestContoller {
	
	@Autowired
	private EmployeeService DAOService;
	
	@GetMapping("/employee")
	public List<Employee> findAll(){
		return DAOService.findAll();
	}
	
	@GetMapping("/employee/{id}")
	public Employee findById(@PathVariable int id){
		return DAOService.findById(id);
	}
	
	@PutMapping("/employee")
	public Employee Add(@RequestBody Employee employee){
		Employee e = new Employee();
		
		e= DAOService.save(employee);
		return e;
	}
	
	@DeleteMapping("/employee/{id}")
	public int delete(@PathVariable int id){
		 return DAOService.delete(id);
	}

}
