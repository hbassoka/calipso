package com.jdevhub.calipso.dao.impl;

import com.jdevhub.calipso.dao.CustomerDao;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;


@ApplicationScoped
public class CustomerDaoImpl implements CustomerDao{

	@PersistenceContext(unitName = "CALIPSO")
	private EntityManager em;
	
	public CustomerDaoImpl(EntityManager em) {
		super();
		this.em = em;
	}
	
}
