package com.example.jeudecartes.Services.Impl;

import com.example.jeudecartes.Models.Card;
import com.example.jeudecartes.Services.CardService;
import com.example.jeudecartes.Utils.Constants;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
@Service
public class CardServiceImpl implements CardService {

    private Random random = new Random();

    @Override
    public List<Card> CreateDeck() {
        List<Card> cardList = new ArrayList<>();
        for (int i=0; i<10; i++){
            String value = Constants.VALUES.get(random.nextInt(Constants.VALUES.size()));
            String color = Constants.COLORS.get(random.nextInt(Constants.COLORS.size()));
            Card card = new Card(color,value);
            cardList.add(card);
        }
        return cardList;
    }
}
