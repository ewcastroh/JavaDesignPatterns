package com.ewch.java.design.patterns.structural.adapter;

public class CardAdapter implements Payment {

    Secure secureCreditCard;

    public CardAdapter(String type) {
        if (type.equalsIgnoreCase("black")) {
            secureCreditCard = new BlackCreditCard();
        } else if (type.equalsIgnoreCase("gold")) {
            secureCreditCard = new GoldCreditCard();
        }
    }

    @Override
    public void pay(String type) {
        if (type.equalsIgnoreCase("black")) {
            secureCreditCard.payWithSecureLevelA();
        } else if (type.equalsIgnoreCase("gold")) {
            secureCreditCard.payWithSecureLevelZ();
        }
    }
}
