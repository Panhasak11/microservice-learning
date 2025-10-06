package com.panhasak.bank.loan.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.panhasak.bank.loan.entity.Loan;
import com.panhasak.bank.loan.repository.LoanRepository;
import com.panhasak.bank.loan.service.LoanService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class LoanServiceImpl implements LoanService{

	private final LoanRepository loanRepository;
	
	@Override
	public Loan save(Loan loan) {
		return loanRepository.save(loan);
	}

	@Override
	public List<Loan> getList() {
		return loanRepository.findAll();
	}

	@Override
	public Loan getById(Long id) {
		return loanRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Loan not found"));
	}

}
