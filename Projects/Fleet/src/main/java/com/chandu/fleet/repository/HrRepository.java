package com.chandu.fleet.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chandu.fleet.entity.Hr;

public interface HrRepository extends JpaRepository<Hr, Serializable> {

}
