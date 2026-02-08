package com.jdevhub.calipso.service;

import java.util.List;

import com.jdevhub.calipso.dto.CustomerDto;

import jakarta.ejb.Local;


public interface CustomerService {

	CustomerDto findById(Long id);

    List<CustomerDto> findAll();

  
    CustomerDto create(CustomerDto dto);


    CustomerDto update(CustomerDto dto);

 
    void delete(Long id) ;
}
