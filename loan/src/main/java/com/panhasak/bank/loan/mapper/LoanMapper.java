package com.panhasak.bank.loan.mapper;

import org.mapstruct.Mapper;

import com.panhasak.bank.loan.dto.LoanDto;
import com.panhasak.bank.loan.entity.Loan;

@Mapper(componentModel = "spring")
public interface LoanMapper {

	Loan toLoan(LoanDto loanDto);
	
	LoanDto toLoanDto(Loan loan);
}
