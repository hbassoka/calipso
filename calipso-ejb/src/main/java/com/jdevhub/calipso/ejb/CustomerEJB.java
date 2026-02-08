package com.jdevhub.calipso.ejb;

import java.util.List;

import com.jdevhub.calipso.dto.CustomerDto;
import com.jdevhub.calipso.service.CustomerService;

import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@Stateless
public class CustomerEJB {

	@Inject
    private CustomerService customerService;

    // --- CRUD using DTOs ---

    public CustomerDto findById(Long id) {
       return customerService.findById(id);
       
    }

    public List<CustomerDto> findAll() {
        return customerService.findAll();
    }

    @Transactional
    public CustomerDto create(CustomerDto dto) {
       
        return  customerService.create(dto);
    }

    @Transactional
    public CustomerDto update(CustomerDto dto) {
        
        return customerService.update(dto);
    }

    @Transactional
    public void delete(Long id) {
        customerService.delete(id);
    }
}
