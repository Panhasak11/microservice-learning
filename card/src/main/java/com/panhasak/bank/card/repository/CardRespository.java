package com.panhasak.bank.card.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.panhasak.bank.card.entity.Card;

public interface CardRespository extends JpaRepository<Card, Long>{

}
