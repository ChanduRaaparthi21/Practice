package com.chandu.fleet.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chandu.fleet.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
   public Optional<Employee> findByUsername(String username);
    
    
}
