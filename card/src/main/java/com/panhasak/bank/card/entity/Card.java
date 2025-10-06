package com.panhasak.bank.card.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "card")
public class Card {

	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long cardId;
	private Long customerId;
	private String cardNumber;
	private String cardType;
	private BigDecimal totalLimit;
	private BigDecimal amountUse;
	private BigDecimal availableAmount;
	private LocalDate createDate;
}
