package com.panhasak.bank.loan.service;

import java.util.List;

import com.panhasak.bank.loan.entity.Loan;

public interface LoanService {

	Loan save(Loan loan);
	List<Loan> getList();
	Loan getById(Long id);
}
