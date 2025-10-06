package com.panhasak.bank.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.panhasak.bank.account.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{
 
}
