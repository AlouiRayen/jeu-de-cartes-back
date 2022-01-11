package com.example.jeudecartes.Services;

import com.example.jeudecartes.Models.Card;
import com.example.jeudecartes.Models.Order;

import java.util.List;

public interface CardService {
     List<Card> CreateDeck();
     List<Card> sortCards(Order order);
}
