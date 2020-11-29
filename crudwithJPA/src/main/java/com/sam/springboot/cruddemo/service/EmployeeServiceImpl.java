package com.sam.springboot.cruddemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sam.springboot.cruddemo.dao.EmployeeDAO;
import com.sam.springboot.cruddemo.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	@Qualifier("employeeDAOJPAImpl")
	private EmployeeDAO DAOService;

	@Transactional
	public List<Employee> findAll() {

		return DAOService.findAll();
	}

	@Transactional
	public Employee findById(int id) {
		return DAOService.findById(id);
	}

	@Transactional
	public Employee save(Employee theEmployee) {
		return DAOService.saveOrUpdate(theEmployee);
	}

	@Transactional
	public int delete(int id) {
		return DAOService.delete(id);
	}

}
