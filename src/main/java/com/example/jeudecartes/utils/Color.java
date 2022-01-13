package com.example.jeudecartes.utils;

import java.util.Random;

public enum Color {
    Carreaux, Coeur, Pique, Trèfle;

    private static Random random = new Random();

    public static String getRandomColor(){
        return Color.values()[random.nextInt(Color.values().length)].name();
    }
}
