package com.sam.springboot.cruddemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.springboot.cruddemo.dao.EmployeeRepository;
import com.sam.springboot.cruddemo.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	
	private EmployeeRepository employeeRepo;

	
	public List<Employee> findAll() {

		return employeeRepo.findAll();
	}

	
	public Employee findById(int id) {
		Optional<Employee> resutl = employeeRepo.findById(id);
		Employee e=null;
		if(resutl.isPresent())
			e = resutl.get();
		return e;
	}

	
	public Employee save(Employee theEmployee) {
		return employeeRepo.save(theEmployee);
	}


	public void delete(int id) {
		 employeeRepo.deleteById(id);
		
	}

}
