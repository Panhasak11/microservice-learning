package com.panhasak.bank.card.service;

import java.util.List;

import com.panhasak.bank.card.entity.Card;

public interface CardService {

	Card save(Card card);
	List<Card> getAll();
	Card getById(Long id);
}
