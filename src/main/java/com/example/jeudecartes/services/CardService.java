package com.example.jeudecartes.services;

import com.example.jeudecartes.models.Card;
import com.example.jeudecartes.models.Order;

import java.util.List;

public interface CardService {
     List<Card> CreateDeck();
     List<Card> sortCards(Order order);
}
