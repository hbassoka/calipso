package com.jdevhub.calipso.dao.impl;

import java.util.List;

import com.jdevhub.calipso.dao.AccountDao;
import com.jdevhub.calipso.model.Account;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;




@ApplicationScoped
public class AccountDaoImpl implements AccountDao{

	@PersistenceContext(unitName = "CALIPSO")
	private EntityManager em;

	
	
	@Override
    public Account findById(Long id) {
        return em.find(Account.class, id);
    }

    @Override
    public List<Account> findAll() {
        return em.createQuery("SELECT a FROM Account a", Account.class)
                 .getResultList();
    }

    @Override
    @Transactional
    public void save(Account account) {
        em.persist(account);
    }

    @Override
    @Transactional
    public Account update(Account account) {
        return em.merge(account);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        Account account = em.find(Account.class, id);
        if (account != null) {
            em.remove(account);
        }
    }
	
}
