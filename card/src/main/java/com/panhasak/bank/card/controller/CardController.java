package com.panhasak.bank.card.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.panhasak.bank.card.dto.CardDto;
import com.panhasak.bank.card.entity.Card;
import com.panhasak.bank.card.mapper.CardMapper;
import com.panhasak.bank.card.service.CardService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/card")
@RequiredArgsConstructor
public class CardController {

	private final CardService cardService;
	private final CardMapper cardMapper;
	
	
	@PostMapping("/create")
	public ResponseEntity<?> create(@RequestBody CardDto cardDto){
		Card card = cardMapper.toCard(cardDto);
		card = cardService.save(card);
		return ResponseEntity.ok(cardMapper.toCardDto(card));
	}
	
	@GetMapping("/all")
	public ResponseEntity<?> getAll(){
		List<CardDto> cardDtos = cardService.getAll().stream()
			.map(cardMapper::toCardDto)
			.collect(Collectors.toList());
		return ResponseEntity.ok(cardDtos);
	}
	
	@GetMapping("/id/{id}")
	public ResponseEntity<?> getById(@PathVariable Long id){
		Card card = cardService.getById(id);
		
		return ResponseEntity.ok(cardMapper.toCardDto(card));
	}
}
