package com.jdevhub.calipso.ejb;

import java.util.List;

import com.jdevhub.calipso.dto.AccountDto;
import com.jdevhub.calipso.service.AccountService;

import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@Stateless
public class AccountEJB {

	@Inject
    private AccountService accountService;

    // --- CRUD using DTOs ---

    public AccountDto findById(Long id) {
        
        return accountService.findById(id);
    }

    public List<AccountDto> findAll() {
        return accountService.findAll();
    }

    @Transactional
    public AccountDto create(AccountDto dto) {        
       
        return accountService.create(dto);
    }

    @Transactional
    public AccountDto update(AccountDto dto) {       
        return accountService.update(dto);
    }

    @Transactional
    public void delete(Long id) {
    	accountService.delete(id);
    }
}
