package com.example.jeudecartes.models;

import java.io.Serializable;
import java.util.List;

public class Order implements Serializable {

    private List<String> valuesOrder;
    private List<String> colorsOrder;

    public List<String> getValuesOrder() {return valuesOrder;}

    public void setValuesOrder(List<String> valuesOrder) {this.valuesOrder = valuesOrder;}

    public List<String> getColorsOrder() {return colorsOrder;}

    public void setColorsOrder(List<String> colorsOrder) {this.colorsOrder = colorsOrder;}

    public Order(List<String> valuesOrder, List<String> colorsOrder) {
        this.valuesOrder = valuesOrder;
        this.colorsOrder = colorsOrder;
    }

    public Order() {

    }
}
