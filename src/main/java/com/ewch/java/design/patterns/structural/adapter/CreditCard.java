package com.ewch.java.design.patterns.structural.adapter;

public class CreditCard implements Payment {

    CardAdapter adapter;

    @Override
    public void pay(String type) {
        if (type.equalsIgnoreCase("classic")) {
            System.out.println("Classic Card: You are paying without any security level.");
        } else if (type.equalsIgnoreCase("gold")) {
            adapter = new CardAdapter("gold");
            adapter.pay("gold");
        } else if (type.equalsIgnoreCase("black")) {
            adapter = new CardAdapter("black");
            adapter.pay("black");
        } else {
            System.out.println("It cannot do the payment. Unknown card.");
        }
    }
}
