package com.sam.springboot.cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sam.springboot.cruddemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
