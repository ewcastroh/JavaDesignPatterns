package com.ewch.java.design.patterns.creational.singleton;

public class Card {

    private static Card instance;

    private String cardNumber;

    private Card() {
    }

    public synchronized static Card getInstance() {
        if (instance == null) {
            instance = new Card();
        }
        return instance;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
