package com.example.jeudecartes.Services.Impl;

import com.example.jeudecartes.Models.Card;
import com.example.jeudecartes.Models.Order;
import com.example.jeudecartes.Services.CardService;
import com.example.jeudecartes.Utils.CardComparator;
import com.example.jeudecartes.Utils.Constants;
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
            String color = Constants.COLORS.get(random.nextInt(Constants.COLORS.size()));
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
