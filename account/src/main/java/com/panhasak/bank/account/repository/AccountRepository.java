package com.panhasak.bank.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.panhasak.bank.account.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{

}
