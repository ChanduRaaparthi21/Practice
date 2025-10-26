package com.chandu.spring.springjdbc.dao;

import java.util.List;

import com.chandu.spring.springjdbc.dto.Employee;

public interface Employeedao {
	
	void insertEmployee(Employee employee);
	
	List<Employee> findAllEmployees();
	
	Employee getEmployeeById(String id);
	
	
}
