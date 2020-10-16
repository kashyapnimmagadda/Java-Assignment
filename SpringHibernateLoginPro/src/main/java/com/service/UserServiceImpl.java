package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.UserDao;
import com.dao.UserDaoImpl;
import com.model.User;

@Service
public class UserServiceImpl implements UserService {
	private ApplicationContext cont;

	@Transactional
	public boolean addUser(User user) {
		cont = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		UserDao userDao = cont.getBean("dao", UserDaoImpl.class);
		userDao.saveUser(user);
		return true;
	}

}
