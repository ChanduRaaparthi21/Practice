package com.chandu.Repo_OR_Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chandu.model.User;

public interface UserRepo extends JpaRepository<User, Integer>{
	
	User findByUsername(String username);

}
