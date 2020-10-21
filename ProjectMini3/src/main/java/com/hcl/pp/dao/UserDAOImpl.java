package com.hcl.pp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import com.hcl.pp.model.User;

@Repository
public class UserDAOImpl implements UserDAO {
	private Configuration con;
	private SessionFactory sessionFactory;
	private Session session;
	private Transaction transaction;

	public boolean addUser(User user) {
		con = new Configuration().configure("hibernate.cfg.xml");
		sessionFactory = con.buildSessionFactory();
		session = sessionFactory.openSession();
		transaction = session.beginTransaction();
		List<User> list = session.createQuery("from User").list();
		System.out.println(list.size());
		for (User user2 : list) {
			System.out.println("hi");
			if (user.getUSER_NAME().equals(user2.getUSER_NAME())) {
				System.out.println(user2.getUSER_NAME() + ""
						+ user.getUSER_NAME());
				return false;
			}
		}
		session.save(user);
		transaction.commit();
		return true;
	}

	public boolean authenticateUser(User user) {
		boolean flag = false;
		con = new Configuration().configure("hibernate.cfg.xml");
		sessionFactory = con.buildSessionFactory();
		session = sessionFactory.openSession();
		transaction = session.beginTransaction();
		List<User> list = session.createQuery("from User").list();
		for (User user2 : list) {
			System.out.println(user2.getUSER_NAME() + "  "
					+ user2.getUSER_PASSWD());
			if ((user.getUSER_NAME().equals(user2.getUSER_NAME()))
					&& (user.getUSER_PASSWD().equals(user2.getUSER_PASSWD()))) {
				System.out.println("existed in dao");
				flag = true;
			}
		}
		System.out.println("original");
		System.out.println(flag + user.getUSER_NAME() + "  "
				+ user.getUSER_PASSWD());
		return flag;
	}

}
