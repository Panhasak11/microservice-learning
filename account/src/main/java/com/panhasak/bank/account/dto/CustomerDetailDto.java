package com.panhasak.bank.account.dto;

import java.util.List;

import lombok.Data;

@Data
public class CustomerDetailDto {

	private CustomerDto customerDto;
	private List<CardResponseDto> cardResponseDtos;
	private List<LoanResponseDto> loanResponseDtos;
}
