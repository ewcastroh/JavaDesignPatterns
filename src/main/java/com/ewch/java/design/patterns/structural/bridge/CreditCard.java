package com.ewch.java.design.patterns.structural.bridge;

public abstract class CreditCard {

    protected ICreditCard card;

    protected CreditCard(ICreditCard card) {
        this.card = card;
    }

    public abstract void doPayment();
}
