package com.ewch.java.design.patterns.structural.bridge;

public class SecuredCreditCard implements ICreditCard {

    @Override
    public void doPayment() {
        System.out.println("Payment done WITH SECURITY.");
    }
}
