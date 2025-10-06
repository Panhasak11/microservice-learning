package com.panhasak.bank.card.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.panhasak.bank.card.entity.Card;
import com.panhasak.bank.card.repository.CardRespository;
import com.panhasak.bank.card.service.CardService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CardServiceImpl implements CardService{

	private final CardRespository cardRespository;
	
	@Override
	public Card save(Card card) {
		return cardRespository.save(card);
	}

	@Override
	public List<Card> getAll() {
		return cardRespository.findAll();
	}

	@Override
	public Card getById(Long id) {
		return cardRespository.findById(id)
				.orElseThrow(() -> new RuntimeException("Card not found"));
	}

}
