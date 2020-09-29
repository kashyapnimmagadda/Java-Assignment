package com.main;

import com.dao.UserDao;
import com.dao.UserDaoImpl;
import com.model.User;

public class MainJdbc {

	public static void main(String[] args) {
		User user = new User(8, "fury", 60, "shield");
		UserDao userDao = new UserDaoImpl();
		String output = userDao.createUser(user);
		System.out.println(output);
		User result = userDao.getUserByIdAndCity(7, "queens");
		System.out.println(result.getUserId() + " " + result.getUserAge() + " "
				+ result.getUserName() + " " + result.getUserCity());
	}

}