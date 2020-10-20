package com.hcl.pp.service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hcl.pp.dao.PetDAO;
import com.hcl.pp.dao.PetDAOImpl;

@Service
public class PetServiceImpl implements PetService {
	private ApplicationContext cont;

	@Transactional
	public List getAllPets() {
		cont = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		PetDAO petDAO = cont.getBean("petdao", PetDAOImpl.class);
		List list = petDAO.fetchAll();
		return list;

	}

}