package com.panhasak.bank.account.service.impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.panhasak.bank.account.entity.Account;
import com.panhasak.bank.account.entity.Customer;
import com.panhasak.bank.account.repository.AccountRepository;
import com.panhasak.bank.account.service.AccountService;
import com.panhasak.bank.account.service.CustomerService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService{
	
	
	private final AccountRepository accountRepository;
	private final CustomerService customerService;
	
	
	@Override
	public Account save(Account account) {
//		Customer customer = customerService.findById(account.getCustomer().getCustomerId());
		account.setCreateDate(LocalDate.now());
//		account.setCustomer(customer);
		return accountRepository.save(account);
	}

	@Override
	public List<Account> getAllAccount() {
		return accountRepository.findAll();
	}

	@Override
	public Account findById(Long id) {
		return accountRepository.findById(id)
			.orElseThrow(() -> new RuntimeException("Account not found"));
	}

	
}
