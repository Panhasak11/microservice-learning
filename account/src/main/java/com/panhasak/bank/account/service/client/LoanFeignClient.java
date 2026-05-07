package com.panhasak.bank.account.service.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.panhasak.bank.account.dto.LoanResponseDto;

@FeignClient(name = "loan")
public interface LoanFeignClient {

	@PostMapping("/api/loans/by-cusId/{customerId}")
	List<LoanResponseDto> getLoanInfo(@PathVariable Long customerId);
}
