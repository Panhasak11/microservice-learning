package com.panhasak.bank.account.service;

import java.util.List;

import com.panhasak.bank.account.entity.Customer;

public interface CustomerService {

	Customer save(Customer customer);
	List<Customer> findAllCustomer();
	Customer findById(Long id);
	Long customerId(Customer customer);
}
