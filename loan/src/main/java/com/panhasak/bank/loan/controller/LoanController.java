package com.panhasak.bank.loan.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.panhasak.bank.loan.dto.LoanDto;
import com.panhasak.bank.loan.entity.Loan;
import com.panhasak.bank.loan.mapper.LoanMapper;
import com.panhasak.bank.loan.service.LoanService;

@RestController
@RequestMapping("/api/loans")
public class LoanController {

	
	@Autowired
	private LoanService loanService;
	@Autowired
	private LoanMapper loanMapper;
	
	@PostMapping("/create")	
	public ResponseEntity<?> save(@RequestBody LoanDto loanDto){
		Loan loan = loanMapper.toLoan(loanDto);
		loan = loanService.save(loan);
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(loanMapper.toLoanDto(loan));
	}
	
	@GetMapping("/all")
	public ResponseEntity<?> getAll(){
		List<LoanDto> loanList = loanService.getList().stream()
			.map(loanMapper::toLoanDto)
			.collect(Collectors.toList());
		return ResponseEntity.ok(loanList);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getById(@PathVariable Long id){
		Loan loan = loanService.getById(id);
		return ResponseEntity.status(HttpStatus.FOUND)
				.body(loanMapper.toLoanDto(loan));
	}
	

}
