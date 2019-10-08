package com.ewch.java.design.patterns.behavioral.visitor;

public class GasOffer implements ElementOffer {

    @Override
    public void accept(CreditCardVisitor visitor) {
        visitor.gasOffer(this);
    }
}
