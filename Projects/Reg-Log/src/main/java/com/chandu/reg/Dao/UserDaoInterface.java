package com.chandu.reg.Dao;

import java.util.List;

import com.chandu.reg.Entities.User;

public interface UserDaoInterface {

	public void save(User user);
	public void delete(User user);
	public void update(User user);
	public User findById(int id);
	public List<User> findAll();
	public User findByUsername(String username);
	
	
}
