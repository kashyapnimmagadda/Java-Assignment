package com.hcl.pp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

@Repository
public class PetDAOImpl implements PetDAO {
	private Configuration con;
	private SessionFactory sessionFactory;
	private Session session;
	private Transaction transaction;

	public List fetchAll() {
		con = new Configuration().configure("hibernate.cfg.xml");
		sessionFactory = con.buildSessionFactory();
		session = sessionFactory.openSession();
		transaction = session.beginTransaction();
		List list = session.createQuery("from Pet").list();
		return list;
	}

}
