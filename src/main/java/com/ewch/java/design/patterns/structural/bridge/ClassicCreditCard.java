package com.ewch.java.design.patterns.structural.bridge;

public class ClassicCreditCard extends CreditCard {

    public ClassicCreditCard(ICreditCard card) {
        super(card);
    }

    @Override
    public void doPayment() {
        card.doPayment();
    }
}
