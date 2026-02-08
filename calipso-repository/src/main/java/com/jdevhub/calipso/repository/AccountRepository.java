package com.jdevhub.calipso.repository;

import java.util.List;

import com.jdevhub.calipso.model.Account;



public interface AccountRepository {

	Account findById(Long id);

    List<Account> findAll();

    void save(Account account);

    Account update(Account account);

    void delete(Long id);
	
}
