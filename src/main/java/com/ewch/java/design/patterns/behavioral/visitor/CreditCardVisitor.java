package com.ewch.java.design.patterns.behavioral.visitor;

public interface CreditCardVisitor {

    void gasOffer(GasOffer gasOffer);

    void flyOffer(FlyOffer flyOffer);
}
