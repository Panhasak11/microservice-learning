package com.panhasak.bank.card.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.Data;

@Data
public class CardDto {

	private Long customerId;
	private String cardNumber;
	private String cardType;
	private BigDecimal totalLimit;
	private BigDecimal amountUse;
	private BigDecimal availableAmount;
	private LocalDate createDate;
}
