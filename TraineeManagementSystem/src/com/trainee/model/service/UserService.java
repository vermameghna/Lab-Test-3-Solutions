package com.trainee.model.service;

import com.trainee.model.dao.User;

public interface UserService {
	public void addUser(User user);
	public User getUser(String username,String password);
}
