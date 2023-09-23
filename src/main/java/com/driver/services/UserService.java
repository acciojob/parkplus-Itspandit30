package com.driver.services.impl;

import com.driver.model.User;
import com.driver.services.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public void deleteUser(Integer userId) {
		// Implement user deletion logic
	}

	@Override
	public User updatePassword(Integer userId, String password) {
		// Implement password update logic
		return updatedUser;
	}

	@Override
	public void register(String name, String phoneNumber, String password) {
		// Implement user registration logic
	}
}
