package com.chandu.fleet.service;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.chandu.fleet.dto.EmployeeInfoUserDetails;
import com.chandu.fleet.entity.Employee;
import com.chandu.fleet.repository.EmployeeRepository;

@Service
public class EmployeeInfoUserDetailsService implements UserDetailsService {

	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Optional<Employee> employee =  	 employeeRepository.findByUsername(username);
		return employee.map(EmployeeInfoUserDetails:: new )
				.orElseThrow(()-> new UsernameNotFoundException("user not found"));
	}

}
