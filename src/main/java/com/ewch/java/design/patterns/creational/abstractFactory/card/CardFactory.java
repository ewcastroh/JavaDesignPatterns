package com.ewch.java.design.patterns.creational.abstractFactory.card;

import com.ewch.java.design.patterns.creational.abstractFactory.AbstractFactory;

public class CardFactory implements AbstractFactory<Card> {

    @Override
    public Card create(String type) {
        if ("VISA".equalsIgnoreCase(type)) {
            return new Visa();
        } else if ("MASTERCARD".equalsIgnoreCase(type)) {
            return new Mastercard();
        }
        return null;
    }
}
