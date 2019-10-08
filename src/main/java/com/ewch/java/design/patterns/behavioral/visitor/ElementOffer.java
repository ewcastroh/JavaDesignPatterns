package com.ewch.java.design.patterns.behavioral.visitor;

public interface ElementOffer {

    void accept(CreditCardVisitor visitor);
}
