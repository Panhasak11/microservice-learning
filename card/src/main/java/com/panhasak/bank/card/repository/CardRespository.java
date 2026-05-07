package com.panhasak.bank.card.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.panhasak.bank.card.entity.Card;

public interface CardRespository extends JpaRepository<Card, Long>{

	List<Card> findByCustomerId(Long id);
}
