package com.jdevhub.calipso.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import com.jdevhub.calipso.dao.AccountDao;
import com.jdevhub.calipso.dto.AccountDto;
import com.jdevhub.calipso.mapper.AccountMapper;
import com.jdevhub.calipso.model.Account;
import com.jdevhub.calipso.service.AccountService;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Default;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class AccountServiceImpl implements AccountService {

	@Inject	
    private AccountDao accountDao;

    // --- CRUD Methods using DTOs ---

    public AccountDto findById(Long id) {
        Account account = accountDao.findById(id);
        return AccountMapper.toDto(account);
    }

    public List<AccountDto> findAll() {
        return accountDao.findAll()
                         .stream()
                         .map(AccountMapper::toDto)
                         .collect(Collectors.toList());
    }

    @Transactional
    public AccountDto create(AccountDto dto) {
        Account account = AccountMapper.toEntity(dto);
        accountDao.save(account);
        return AccountMapper.toDto(account);
    }

    @Transactional
    public AccountDto update(AccountDto dto) {
        Account account = AccountMapper.toEntity(dto);
        Account updated = accountDao.update(account);
        return AccountMapper.toDto(updated);
    }

    @Transactional
    public void delete(Long id) {
        accountDao.delete(id);
    }
}
