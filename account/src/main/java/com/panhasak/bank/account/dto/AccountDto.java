package com.panhasak.bank.account.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class AccountDto {

	private Long accountId;
	private Long customerId;
	private String accountType;
	private String branchAdd;
	private LocalDate createDate;
}
