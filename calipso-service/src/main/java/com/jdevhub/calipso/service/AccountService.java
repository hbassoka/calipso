package com.jdevhub.calipso.service;

import java.util.List;

import com.jdevhub.calipso.dto.AccountDto;

import jakarta.ejb.Local;



public interface AccountService {


    AccountDto findById(Long id) ;

    List<AccountDto> findAll();

   
    AccountDto create(AccountDto dto);
   
    
    AccountDto update(AccountDto dto);

   
    void delete(Long id);
}
