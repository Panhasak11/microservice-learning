package com.panhasak.bank.account.dto;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class CardResponseDto {

	private Long customerId;
	private String cardNumber;
	private String cardType;
	private BigDecimal totalLimit;
	private BigDecimal amountUse;
	private BigDecimal availableAmount;
}
