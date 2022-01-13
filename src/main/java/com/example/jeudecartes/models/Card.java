package com.example.jeudecartes.models;

import java.io.Serializable;

public class Card implements  Serializable {
    private String color;
    private String value;

    public String getColor() {return color;}

    public void setColor(String color) {this.color = color;}

    public String getValue() {return value;}

    public void setValue(String value) {this.value = value;}

    public Card(String color, String value) {
        this.color = color;
        this.value = value;
    }

    @Override
    public String toString() {
        return value +" "+ color;
    }
}
