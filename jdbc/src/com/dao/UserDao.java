package com.dao;

import com.model.User;

public interface UserDao {
	public String createUser(User user);

	public User getUserById(int userId);

	public User getUserByName(String userName);

	public User getUserByIdAndCity(int userId, String userCity);
}
