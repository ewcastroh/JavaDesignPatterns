package com.ewch.java.design.patterns.creational.abstractFactory.card;

public class Mastercard implements Card {

    @Override
    public String getCardType() {
        return "MASTERCARD";
    }

    @Override
    public String getCardNumber() {
        return "1098 7654 3210 MASTERCARD";
    }
}
