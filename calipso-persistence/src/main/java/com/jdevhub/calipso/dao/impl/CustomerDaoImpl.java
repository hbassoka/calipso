package com.jdevhub.calipso.dao.impl;

import java.util.List;

import com.jdevhub.calipso.dao.CustomerDao;
import com.jdevhub.calipso.model.Customer;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class CustomerDaoImpl implements CustomerDao{

	@PersistenceContext(unitName = "CALIPSO")
	private EntityManager em;
	
	
	
	@Override
    public Customer findById(Long id) {
        return em.find(Customer.class, id);
    }

    @Override
    public List<Customer> findAll() {
        return em.createQuery("SELECT c FROM Customer c", Customer.class)
                 .getResultList();
    }

    @Override
    @Transactional
    public void save(Customer customer) {
        // Persiste le customer et cascade sur les accounts si présents
        em.persist(customer);
    }

    @Override
    @Transactional
    public Customer update(Customer customer) {
        // merge gère aussi les modifications des accounts si cascade ALL
        return em.merge(customer);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        Customer customer = em.find(Customer.class, id);
        if (customer != null) {
            em.remove(customer); // supprime aussi les accounts associés grâce à orphanRemoval=true
        }
    }
}
