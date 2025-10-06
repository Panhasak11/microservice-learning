package com.panhasak.bank.account.service;

import java.util.List;

import com.panhasak.bank.account.entity.Account;

public interface AccountService {

	Account save(Account account);
	List<Account> getAllAccount();
	Account findById(Long id);
	
}
