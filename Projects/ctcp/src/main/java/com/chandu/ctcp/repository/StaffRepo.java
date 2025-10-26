package com.chandu.ctcp.repository;

import com.chandu.ctcp.model.Admin;
import com.chandu.ctcp.model.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StaffRepo extends JpaRepository<Staff, Integer> {
    Staff findByNameAndPasswordAndRole(String name, String password, String role);

    Optional<Staff> findByName(String name);

    Optional<Staff> findByNameAndRole(String name, String role);
}
