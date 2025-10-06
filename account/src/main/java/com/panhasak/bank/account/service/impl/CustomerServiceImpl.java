package com.panhasak.bank.account.service.impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.panhasak.bank.account.entity.Customer;
import com.panhasak.bank.account.repository.AccountRepository;
import com.panhasak.bank.account.repository.CustomerRepository;
import com.panhasak.bank.account.service.CustomerService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService{

    private final AccountRepository accountRepository;

	private final CustomerRepository customerRepository;

	@Override
	public Customer save(Customer customer) {
		customer.setCreateDate(LocalDate.now());
		return customerRepository.save(customer);
	}

	@Override
	public List<Customer> findAllCustomer() {
		return customerRepository.findAll();
	}

	@Override
	public Customer findById(Long id) {
		return customerRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Customer not found"));
	}

	@Override
	public Long customerId(Customer customer) {
		return customer.getCustomerId();
	}

}
