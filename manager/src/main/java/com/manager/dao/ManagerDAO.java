package com.manager.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.manager.entity.Manager;

@Repository
public class ManagerDAO implements ManagerDAOInterface{
	
	@Autowired
	private DataSource ds;
	
		
	@Autowired
	private EntityManagerFactory emf;

	@Override
	public List<Manager> getdaoalljpa() {
		EntityManager em=emf.createEntityManager();
		Query q=em.createQuery("from com.manager.entity.Manager e");
		
		return q.getResultList();
	}	

	}
