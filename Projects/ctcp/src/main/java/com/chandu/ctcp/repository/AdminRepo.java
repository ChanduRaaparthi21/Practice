package com.chandu.ctcp.repository;

import com.chandu.ctcp.model.Admin;
import com.chandu.ctcp.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AdminRepo extends JpaRepository<Admin, Integer> {

    Admin findByNameAndPassword(String name, String password);

    Optional<Admin> findByName(String name);
}
