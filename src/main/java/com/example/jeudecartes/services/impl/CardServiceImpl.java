package com.example.jeudecartes.services.impl;

import com.example.jeudecartes.models.Card;
import com.example.jeudecartes.models.Order;
import com.example.jeudecartes.services.CardService;
import com.example.jeudecartes.utils.CardComparator;
import com.example.jeudecartes.utils.Color;
import com.example.jeudecartes.utils.Constants;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
@Service
public class CardServiceImpl implements CardService {

    private Random random = new Random();
    private List<Card> currentCardsList = new ArrayList<>();

    @Override
    public List<Card> CreateDeck() {
        List<Card> cardList = new ArrayList<>();
        for (int i=0; i<10; i++){
            String value = Constants.VALUES.get(random.nextInt(Constants.VALUES.size()));
            String color = Color.getRandomColor();
            Card card = new Card(color,value);
            cardList.add(card);
            this.currentCardsList=cardList;
        }
        return cardList;
    }

    @Override
    public List<Card> sortCards( Order order) {
        CardComparator cardComparator = new CardComparator(order);
        Collections.sort(currentCardsList,cardComparator);
        return currentCardsList;
    }
}
