package com.panhasak.bank.account.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.panhasak.bank.account.dto.AccountDto;
import com.panhasak.bank.account.entity.Account;
import com.panhasak.bank.account.service.CustomerService;

@Mapper(componentModel = "spring", uses = {CustomerService.class})
public interface AccountMapper {

	@Mapping(target = "customerId", source = "customerId")
	Account toAccount(AccountDto dto);
	
	@Mapping(target = "customerId", source = "customerId")
	AccountDto toAccountDto(Account account);
}
