package com.example.jeudecartes.Utils;

import com.example.jeudecartes.Models.Card;
import com.example.jeudecartes.Models.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(SpringExtension.class)
@SpringBootTest
class CardComparatorTest {

    private final CardComparator cardComparator = new CardComparator(new Order(Constants.VALUES,Constants.COLORS));

    @Test
    void testEqual() {
        Card cardOne = new Card("Pique","6");
        Card cardTwo = new Card("Pique","6");
        int result = cardComparator.compare(cardOne,cardTwo);
        assertTrue(result == 0,"expected to be equal");
    }

    @Test
    void testGreaterThan() {
        Card cardOne = new Card("Pique","6");
        Card cardTwo = new Card("Carreaux","6");
        int result = cardComparator.compare(cardOne,cardTwo);
        assertTrue(result >= 1,"expected to be greater");
    }

    @Test
    void testLessThan() {
        Card cardOne = new Card("Carreaux","As");
        Card cardTwo = new Card("Pique","6");
        int result = cardComparator.compare(cardOne,cardTwo);
        assertTrue(result <= -1,"expected to be smaller");
    }
}