package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import com.model.User;

@Repository
public class UserDaoImpl implements UserDao {
	private Configuration con;
	private SessionFactory sessionFactory;
	private Session session;
	private Transaction transaction;

	public boolean saveUser(User user) {
		con = new Configuration().configure("hibernate.cfg.xml");
		sessionFactory = con.buildSessionFactory();
		session = sessionFactory.openSession();
		transaction = session.beginTransaction();
		session.save(user);
		transaction.commit();
		return true;
	}

}
