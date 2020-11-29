package com.sam.springboot.cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sam.springboot.cruddemo.entity.Employee;

@RepositoryRestResource(path="member")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
