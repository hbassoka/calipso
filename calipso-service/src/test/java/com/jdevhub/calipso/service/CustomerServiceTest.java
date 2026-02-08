package com.jdevhub.calipso.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDateTime;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.jdevhub.calipso.model.Customer;
import com.jdevhub.calipso.repository.CustomerRepository;
import com.jdevhub.calipso.service.impl.CustomerServiceImpl;

@ExtendWith(MockitoExtension.class)
class CustomerServiceTest {

    @InjectMocks
    private CustomerServiceImpl customerService; // Classe concrète

    @Mock
    private CustomerRepository customerDao;

    @BeforeAll
    static void beforeAll() {
        System.out.println("=== Début des tests CustomerService ===");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("=== Fin des tests CustomerService ===");
    }

	/*
	 * @Test void createCustomer_shouldPersistCustomer() {
	 * 
	 * // Création d'un objet Customer Customer customer = new Customer();
	 * customer.setFirstname("John"); customer.setLastname("Doe");
	 * customer.setEmail("john.doe@jdevhub.com");
	 * customer.setCreationDate(LocalDateTime.now());
	 * 
	 * // Stub : quand save est appelé, renvoyer le customer
	 * when(customerDao.save(any(Customer.class))).thenReturn(customer);
	 * 
	 * // Appel du service Customer result = customerService.create(customer);
	 * 
	 * // Assertions assertNotNull(result,
	 * "Le customer retourné ne doit pas être null"); assertEquals("John",
	 * result.getFirstname(), "Le prénom doit être John");
	 * 
	 * // Vérification que le DAO save a été appelé
	 * verify(customerDao).save(customer); }
	 */
}
