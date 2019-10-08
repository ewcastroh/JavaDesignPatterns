package com.ewch.java.design.patterns.structural.adapter;

public class BlackCreditCard implements Secure {

    @Override
    public void payWithSecureLevelA() {
        System.out.println("Black Card: You are paying with A level security (High).");
    }

    @Override
    public void payWithSecureLevelZ() {
        // No implement
    }
}
