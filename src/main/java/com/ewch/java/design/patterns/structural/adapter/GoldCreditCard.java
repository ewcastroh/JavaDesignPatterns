package com.ewch.java.design.patterns.structural.adapter;

public class GoldCreditCard implements Secure {

    @Override
    public void payWithSecureLevelA() {
        // No implement
    }

    @Override
    public void payWithSecureLevelZ() {
        System.out.println("Gold Card: You are paying with Z level security (Low).");
    }
}
