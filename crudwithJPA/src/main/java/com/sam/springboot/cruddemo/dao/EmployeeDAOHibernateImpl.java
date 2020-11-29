package com.sam.springboot.cruddemo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sam.springboot.cruddemo.entity.Employee;

@Repository
public class EmployeeDAOHibernateImpl implements EmployeeDAO {
	
	//Define entity manager and setup constructor injection
	//** theEntityManger is automatically created ny spring boot
	
	private EntityManager entityManager;
	
	@Autowired
	public EmployeeDAOHibernateImpl(EntityManager theEntityManger) {
		this.entityManager=theEntityManger;
	}
	
	
	
	public List<Employee> findAll() {
		Session session = this.entityManager.unwrap(Session.class);
		
		
				
		Query<Employee> theQuery = session.createQuery("from Employee", Employee.class);
		
		
		List<Employee> employees =  theQuery.getResultList();
		
		return employees;
	}


	public Employee findById(int id) {
		Session session = this.entityManager.unwrap(Session.class);
		return session.get(Employee.class, id);
	 
	}


	public Employee save(Employee theEmployee) {
		Session session = this.entityManager.unwrap(Session.class);
		session.saveOrUpdate(theEmployee);
		return theEmployee;
		
	}


	public int delete(int id) {
		Session session = this.entityManager.unwrap(Session.class);
		Query<Employee> theQuery = session.createQuery("Delete from Employee where id=:employeeId");
		theQuery.setParameter("employeeId", id);
		theQuery.executeUpdate();
		return id ;
	}



	public Employee saveOrUpdate(Employee theEmployee) {
		// TODO Auto-generated method stub
		return null;
	}

}
