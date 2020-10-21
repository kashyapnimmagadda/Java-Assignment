package com.hcl.pp.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hcl.pp.dao.UserDAO;
import com.hcl.pp.dao.UserDAOImpl;
import com.hcl.pp.model.User;

@Service
public class UserServiceImpl implements UserService {
	private ApplicationContext cont;

	@Transactional
	public boolean addUser(User user) {
		cont = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		UserDAO userDao = cont.getBean("dao", UserDAOImpl.class);
		boolean isSaved = userDao.addUser(user);
		return isSaved;

	}

}
