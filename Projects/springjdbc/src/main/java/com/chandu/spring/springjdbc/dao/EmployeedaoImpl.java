package com.chandu.spring.springjdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.chandu.spring.springjdbc.dao.rowmapers.EmployeeRowMaper;
import com.chandu.spring.springjdbc.dto.Employee;

public class EmployeedaoImpl implements Employeedao {
	
	JdbcTemplate jdbcTemplate;
	
	
	

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void insertEmployee(Employee employee) {
		
		//code to insert Employee Object into database
		String sql="insert into employee values(?,?,?)";
		
		System.out.println("quary is :"+sql);
		
		jdbcTemplate.update(sql,employee.getId(),employee.getName(),employee.getExp());
		
	}

	public List<Employee> findAllEmployees() {
		EmployeeRowMaper rowMaper = new EmployeeRowMaper();
		
	List<Employee> employees = jdbcTemplate.query("select * from employee",rowMaper);
		
		
		return employees;
	}

	public Employee getEmployeeById(String id) {
		//code to get Employee based on particular id
		
		return null;
	}

}
