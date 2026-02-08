package com.jdevhub.calipso.dao.impl;

import com.jdevhub.calipso.dao.AccountDao;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;



@ApplicationScoped
public class AccountDaoImpl implements AccountDao{

	@PersistenceContext(unitName = "CALIPSO")
	private EntityManager em;

	public AccountDaoImpl(EntityManager em) {
		super();
		this.em = em;
	}
	
	
	
}
