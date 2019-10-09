package com.ewch.java.design.patterns.structural.bridge;

public class UnsecuredCreditCard implements ICreditCard {

    @Override
    public void doPayment() {
        System.out.println("Payment done WITHOUT SECURITY.");
    }
}
