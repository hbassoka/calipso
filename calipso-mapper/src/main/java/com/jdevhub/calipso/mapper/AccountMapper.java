package com.jdevhub.calipso.mapper;




import java.util.List;
import java.util.stream.Collectors;

import com.jdevhub.calipso.dto.AccountDto;
import com.jdevhub.calipso.model.Account;


public class AccountMapper {

    public static AccountDto toDto(Account account) {
        if (account == null) return null;

        return new AccountDto(
            account.getId(),
            account.getNumber(),
            account.getBalance(),
            account.getCreationDate(),
            CustomerMapper.toDto(account.getCustomer())
        );
    }

    public static Account toEntity(AccountDto dto) {
        if (dto == null) return null;

        Account account = new Account();
        account.setId(dto.id());
        account.setNumber(dto.number());
        account.setBalance(dto.balance());
        account.setCreationDate(dto.creationDate());
        account.setCustomer(CustomerMapper.toEntity(dto.customer()));

        return account;
    }

    public static List<AccountDto> toDtoList(List<Account> accounts) {
        return accounts.stream()
                       .map(AccountMapper::toDto)
                       .collect(Collectors.toList());
    }
}