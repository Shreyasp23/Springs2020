package com.sam.springboot.cruddemo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sam.springboot.cruddemo.entity.Employee;

@Repository
public class EmployeeDAOJPAImpl implements EmployeeDAO {

	private EntityManager entityManager;
	
	@Autowired
	public EmployeeDAOJPAImpl(EntityManager e) {
		entityManager=e;
	}
	
	public List<Employee> findAll() {
		Query theQuery = entityManager.createQuery("from Employee");
		List<Employee> empList = theQuery.getResultList();
		return empList;
	}

	public Employee findById(int id) {
		Employee emp = entityManager.find(Employee.class, id);
		return emp;
	}

	public Employee save(Employee theEmployee) {
		 entityManager.persist(theEmployee);
		return theEmployee;
	}
	
	public Employee saveOrUpdate(Employee theEmployee) {
		return entityManager.merge(theEmployee);
		
	}

	public int delete(int id) {
		Employee emp = entityManager.find(Employee.class, id);
		entityManager.remove(emp);
		return emp.getId();
	}

}
