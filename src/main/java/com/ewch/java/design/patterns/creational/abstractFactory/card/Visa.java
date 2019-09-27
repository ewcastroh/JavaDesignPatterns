package com.ewch.java.design.patterns.creational.abstractFactory.card;

public class Visa implements Card {

    @Override
    public String getCardType() {
        return "VISA";
    }

    @Override
    public String getCardNumber() {
        return "0123 4567 8910 VISA";
    }
}
