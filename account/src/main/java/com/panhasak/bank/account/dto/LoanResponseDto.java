package com.panhasak.bank.account.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.Data;

@Data
public class LoanResponseDto {

	private Long loanNumber;
	private Long customerId;
	private LocalDate startDate;
	private String loanType;
	private BigDecimal totalLoan;
	private BigDecimal amountPaid;
	private BigDecimal outstandingAmount;
	private LocalDate createDate;
}
