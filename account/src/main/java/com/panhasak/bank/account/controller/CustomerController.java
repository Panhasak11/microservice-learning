package com.panhasak.bank.account.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.discovery.converters.Auto;
import com.panhasak.bank.account.dto.CardResponseDto;
import com.panhasak.bank.account.dto.CustomerDetailDto;
import com.panhasak.bank.account.dto.CustomerDto;
import com.panhasak.bank.account.dto.LoanResponseDto;
import com.panhasak.bank.account.entity.Customer;
import com.panhasak.bank.account.mapper.CustomerMapper;
import com.panhasak.bank.account.service.CustomerService;
import com.panhasak.bank.account.service.client.CardFeignClient;
import com.panhasak.bank.account.service.client.LoanFeignClient;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/customers")
@RequiredArgsConstructor
public class CustomerController {

	private final CustomerService customerService;
	private final CustomerMapper customerMapper;
	
	@Autowired
	private LoanFeignClient loanFeignClient;
	@Autowired
	private CardFeignClient cardFeignClient;
	
	@PostMapping("/create")
	public ResponseEntity<?> save(@RequestBody CustomerDto customerDto){
		Customer customer = customerMapper.toCustomer(customerDto);
		customer = customerService.save(customer);
		return ResponseEntity.ok(customerMapper.toCustomerDto(customer));
	}
	
	
	@GetMapping("/all")
	public ResponseEntity<?> getAllCustomer(){
		List<Customer> allCustomer = customerService.findAllCustomer();
		return ResponseEntity.ok(allCustomer);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getById(@PathVariable Long id){
		Customer customer = customerService.findById(id);
		return ResponseEntity.ok(customerMapper.toCustomerDto(customer));
	}
	
	@PostMapping("/detail/{customerId}")
	public ResponseEntity<CustomerDetailDto> getCustomerDetail(@PathVariable Long customerId){
		
		CustomerDetailDto customerDto = new CustomerDetailDto();
		
		Customer customer = customerService.findById(customerId);
		if(customer != null) {
			List<CardResponseDto> cardInfor = cardFeignClient.getCardInfor(customerId);
			List<LoanResponseDto> loanInfo = loanFeignClient.getLoanInfo(customerId);
			
			customerDto.setCustomerDto(customerMapper.toCustomerDto(customer));
			customerDto.setCardResponseDtos(cardInfor);
			customerDto.setLoanResponseDtos(loanInfo);
			
		}else {
			throw new RuntimeException("Customer not found");
		}
		
		return ResponseEntity.ok(customerDto);
	}
	
	
	
}
