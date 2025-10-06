package com.panhasak.bank.account.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.panhasak.bank.account.dto.AccountDto;
import com.panhasak.bank.account.entity.Account;
import com.panhasak.bank.account.mapper.AccountMapper;
import com.panhasak.bank.account.service.AccountService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/account")
@RequiredArgsConstructor
public class AccountController {

	private final AccountService accountService;
	private final AccountMapper accountMapper;
	
	@PostMapping("/create")
	public ResponseEntity<?> save(@RequestBody AccountDto accountDto){
		Account account = accountMapper.toAccount(accountDto);
		account = accountService.save(account);
		return ResponseEntity.ok(accountMapper.toAccountDto(account));
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getById(@PathVariable Long id){
		Account account = accountService.findById(id);
		return ResponseEntity.ok(accountMapper.toAccountDto(account));
	}
	
	@GetMapping("/list")
	public ResponseEntity<?> getAll(){
		List<AccountDto> accountDtos = accountService.getAllAccount().stream()
			.map(accountMapper::toAccountDto)
			.collect(Collectors.toList());
		return ResponseEntity.ok(accountDtos);
	}
}
