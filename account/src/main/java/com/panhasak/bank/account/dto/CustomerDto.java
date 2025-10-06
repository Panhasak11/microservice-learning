package com.panhasak.bank.account.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class CustomerDto {

	private String name;
	private String email;
	private String phone;
	private LocalDate createDate;
}
