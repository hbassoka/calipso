package com.jdevhub.calipso.dao;

import java.util.List;

import com.jdevhub.calipso.model.Account;

import jakarta.ejb.Local;



public interface AccountDao {

	Account findById(Long id);

    List<Account> findAll();

    void save(Account account);

    Account update(Account account);

    void delete(Long id);
	
}
