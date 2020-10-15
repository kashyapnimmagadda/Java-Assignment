package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.User;

@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	private SessionFactory sessionFactory;

	public boolean readUserByNameandId(User user) {
		Session session = sessionFactory.openSession();
		boolean userfound = false;
		String SQL_QUERY = "from User as u where u.userName = ? and u.password = ? ";
		javax.persistence.Query query = session.createQuery(SQL_QUERY);
		query.setParameter(0, user.getUserName());
		query.setParameter(1, user.getPassword());
		List list = query.getResultList();
		if ((list != null) && (list.size() > 0)) {
			userfound = true;
		}
		session.close();
		return userfound;
	}

}
