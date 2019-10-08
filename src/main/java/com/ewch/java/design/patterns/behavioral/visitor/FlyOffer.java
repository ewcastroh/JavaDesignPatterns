package com.ewch.java.design.patterns.behavioral.visitor;

public class FlyOffer implements ElementOffer {

    @Override
    public void accept(CreditCardVisitor visitor) {
        visitor.flyOffer(this);
    }
}
