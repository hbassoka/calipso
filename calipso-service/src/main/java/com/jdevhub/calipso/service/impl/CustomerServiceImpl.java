package com.jdevhub.calipso.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import com.jdevhub.calipso.dao.CustomerDao;
import com.jdevhub.calipso.dto.CustomerDto;
import com.jdevhub.calipso.mapper.CustomerMapper;
import com.jdevhub.calipso.model.Customer;
import com.jdevhub.calipso.service.CustomerService;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class CustomerServiceImpl implements CustomerService {

	@Inject
    private CustomerDao customerDao;

    // --- CRUD Methods using DTOs ---

    public CustomerDto findById(Long id) {
        Customer customer = customerDao.findById(id);
        return CustomerMapper.toDto(customer);
    }

    public List<CustomerDto> findAll() {
        return customerDao.findAll()
                          .stream()
                          .map(CustomerMapper::toDto)
                          .collect(Collectors.toList());
    }

    @Transactional
    public CustomerDto create(CustomerDto dto) {
        Customer customer = CustomerMapper.toEntity(dto);
        customerDao.save(customer);
        return CustomerMapper.toDto(customer);
    }

    @Transactional
    public CustomerDto update(CustomerDto dto) {
        Customer customer = CustomerMapper.toEntity(dto);
        Customer updated = customerDao.update(customer);
        return CustomerMapper.toDto(updated);
    }

    @Transactional
    public void delete(Long id) {
        customerDao.delete(id);
    }
}
