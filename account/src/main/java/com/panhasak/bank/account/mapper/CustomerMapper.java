package com.panhasak.bank.account.mapper;

import org.mapstruct.Mapper;

import com.panhasak.bank.account.dto.CustomerDto;
import com.panhasak.bank.account.entity.Customer;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

	Customer toCustomer(CustomerDto customerDto);
	
	CustomerDto toCustomerDto(Customer customer);
}
