package com.jdevhub.calipso.service;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

import com.jdevhub.calipso.repository.AccountRepository;


public class AccountServiceTest {

	@Test
	void createAccount() {
		
		AccountRepository accountDao=mock(AccountRepository.class);
		
		when(accountDao.update(null)).thenReturn(null);
	}
}
