package com.trainee.model.service;


import com.trainee.model.dao.User;
import com.trainee.model.dao.UserDao;
import com.trainee.model.dao.UserDaoImpl;

public class UserServiceImpl implements UserService{
	private UserDao userDao;
	
	public UserServiceImpl() {
		userDao = new UserDaoImpl();
	}

	@Override
	public void addUser(User user) {
		 userDao.addUser(user);
	}

	@Override
	public User getUser(String username, String password) {
		return userDao.getUser(username,password);
	}
	
}
