	package com.chandu.fleet.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.chandu.fleet.entity.Employee;
import com.chandu.fleet.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
    
    @Autowired
    private PasswordEncoder encoder;

    public Employee registerEmployee(Employee employee) {
    	
    	employee.setPassword(encoder.encode(employee.getPassword()));
        return employeeRepository.save(employee); 
    }

    public Optional<Employee> getEmployeeByUsername(String username) {
        return employeeRepository.findByUsername(username);
    }
}
