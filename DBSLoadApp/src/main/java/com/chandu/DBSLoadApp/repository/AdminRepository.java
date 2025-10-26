package com.chandu.DBSLoadApp.repository;

import com.chandu.DBSLoadApp.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Long> {
    Admin findByUsername(String username);
}