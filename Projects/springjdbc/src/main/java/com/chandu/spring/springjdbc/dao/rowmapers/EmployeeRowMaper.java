package com.chandu.spring.springjdbc.dao.rowmapers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.chandu.spring.springjdbc.dto.Employee;

public class EmployeeRowMaper implements RowMapper<Employee> {

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		
		// TODO Auto-generated method stub
		
		Employee employee = new Employee();
		employee.setId(rs.getNString(1));
		employee.setName(rs.getString(2));
		employee.setExp(rs.getInt(3));
		
		return employee;
	}

}
