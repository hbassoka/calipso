package com.jdevhub.calipso.repository;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import com.jdevhub.calipso.model.Customer;
import com.jdevhub.calipso.repository.CustomerRepository;

import java.util.List;
import java.util.Arrays;

@ExtendWith(MockitoExtension.class)
class CustomerRepositoryTest {

    @Mock
    private EntityManager em;

    @InjectMocks
    private CustomerRepository customerDao; // Constructor injection fonctionne avec Mockito

    @Mock
    private TypedQuery<Customer> query; // Pour mocker createQuery
    
    
	/*
	 * @Test void saveCustomer_shouldCallPersist() { Customer customer = new
	 * Customer(); customer.setFirstname("John");
	 * 
	 * Customer result = customerDao.update(customer);
	 * 
	 * assertNotNull(result); verify(em).persist(customer); // Vérifie que persist a
	 * été appelé }
	 * 
	 * @Test void findById_shouldReturnCustomer() { Customer customer = new
	 * Customer(); when(em.find(Customer.class, 1L)).thenReturn(customer);
	 * 
	 * Customer result = customerDao.findById(1L);
	 * 
	 * assertNotNull(result); verify(em).find(Customer.class, 1L); }
	 * 
	 * @Test void findAll_shouldReturnList() { List<Customer> customers =
	 * Arrays.asList(new Customer(), new Customer());
	 * 
	 * when(em.createQuery("SELECT c FROM Customer c",
	 * Customer.class)).thenReturn(query);
	 * when(query.getResultList()).thenReturn(customers);
	 * 
	 * List<Customer> result = customerDao.findAll();
	 * 
	 * assertEquals(2, result.size());
	 * verify(em).createQuery("SELECT c FROM Customer c", Customer.class);
	 * verify(query).getResultList(); }
	 */
}
