package com.panhasak.bank.card.mapper;

import org.mapstruct.Mapper;

import com.panhasak.bank.card.dto.CardDto;
import com.panhasak.bank.card.entity.Card;

@Mapper(componentModel = "spring")
public interface CardMapper {

	Card toCard(CardDto cardDto);
	
	CardDto toCardDto(Card card);
}
