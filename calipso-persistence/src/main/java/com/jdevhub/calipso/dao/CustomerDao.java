package com.jdevhub.calipso.dao;

import java.util.List;

import com.jdevhub.calipso.model.Customer;

import jakarta.ejb.Local;



public interface CustomerDao {

	Customer findById(Long id);

    List<Customer> findAll();

    void save(Customer customer);

    Customer update(Customer customer);

    void delete(Long id);
}
