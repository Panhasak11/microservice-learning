package com.panhasak.bank.account.service.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.panhasak.bank.account.dto.CardResponseDto;

@FeignClient("card")
public interface CardFeignClient {

	@PostMapping("/api/card/byCutomerId/{customerId}")
	List<CardResponseDto> getCardInfor(@PathVariable Long customerId);
}
