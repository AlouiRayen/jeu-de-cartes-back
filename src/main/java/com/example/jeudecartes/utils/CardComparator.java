package com.example.jeudecartes.utils;

import com.example.jeudecartes.models.Card;
import com.example.jeudecartes.models.Order;

import java.util.Comparator;

public class CardComparator implements Comparator<Card> {

    private Order order;

    public Order getOrder() {return order;}

    public void setOrder(Order order) {this.order = order;}

    public CardComparator(Order order) {
        this.order = order;
    }

    @Override
    public int compare(Card o1, Card o2) {
        if(this.order.getColorsOrder().indexOf(o1.getColor()) < this.order.getColorsOrder().indexOf(o2.getColor())){
            return -1;
        }
        if(this.order.getColorsOrder().indexOf(o1.getColor()) > this.order.getColorsOrder().indexOf(o2.getColor())){
            return 1;
        }
        if(this.order.getValuesOrder().indexOf(o1.getValue()) < this.order.getValuesOrder().indexOf(o2.getValue())){
            return -1;
        }
        if(this.order.getValuesOrder().indexOf(o1.getValue()) > this.order.getValuesOrder().indexOf(o2.getValue())){
            return 1;
        }
        return 0;
    }
}
