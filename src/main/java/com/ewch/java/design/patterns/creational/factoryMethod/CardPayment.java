package com.ewch.java.design.patterns.creational.factoryMethod;

public class CardPayment implements Payment {

    @Override
    public void doPayment() {
        System.out.println("paying with Credit Card...");
    }
}
