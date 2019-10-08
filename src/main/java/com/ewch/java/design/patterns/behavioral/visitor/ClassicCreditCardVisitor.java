package com.ewch.java.design.patterns.behavioral.visitor;

public class ClassicCreditCardVisitor implements CreditCardVisitor {

    @Override
    public void gasOffer(GasOffer gasOffer) {
        System.out.println("3% discount in gas using your Classic Credit Card.");
    }

    @Override
    public void flyOffer(FlyOffer flyOffer) {
        System.out.println("5% discount in fly using your Classic Credit Card.");
    }
}
