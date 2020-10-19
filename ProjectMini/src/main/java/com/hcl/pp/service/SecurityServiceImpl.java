package com.hcl.pp.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hcl.pp.dao.UserDAO;
import com.hcl.pp.dao.UserDAOImpl;
import com.hcl.pp.model.User;

@Service
public class SecurityServiceImpl implements SecurityService {
	private ApplicationContext cont;

	@Transactional
	public boolean authenticateUser(User user) {
		cont = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		UserDAO userDao = cont.getBean("dao", UserDAOImpl.class);
		boolean isExist = userDao.authenticateUser(user);
		return isExist;
	}

}
