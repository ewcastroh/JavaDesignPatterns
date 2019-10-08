package com.ewch.java.design.patterns.behavioral.visitor;

public class BlackCreditCardVisitor implements CreditCardVisitor {

    @Override
    public void gasOffer(GasOffer gasOffer) {
        System.out.println("10% discount in gas using your Black Credit Card.");
    }

    @Override
    public void flyOffer(FlyOffer flyOffer) {
        System.out.println("25% discount in gas using your Black Credit Card.");
    }
}
