package com.chandu.reg.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.chandu.reg.Dao.UserDaoInterface;
import com.chandu.reg.Entities.User;


@Component
public class UserBusinessImpl implements UserBusinessInterface {
	
	@Autowired
	private UserDaoInterface daoInterface;
	

	@Transactional(readOnly = false)
	public void save(User user) {
		// TODO Auto-generated method stub
		daoInterface.save(user);

	}

	@Transactional(readOnly = false)
	public void delete(User user) {
		// TODO Auto-generated method stub
		daoInterface.delete(user);

	}

	@Transactional(readOnly = false)
	public void update(User user) {
		// TODO Auto-generated method stub
		daoInterface.update(user);

	}

	public User findById(int id) {
		// TODO Auto-generated method stub
		return daoInterface.findById(id);
	}

	public List<User> findAll() {
		// TODO Auto-generated method stub
		return daoInterface.findAll();
	}

	public User findByUsername(String username) {
		// TODO Auto-generated method stub
		return daoInterface.findByUsername(username);
	}

}
