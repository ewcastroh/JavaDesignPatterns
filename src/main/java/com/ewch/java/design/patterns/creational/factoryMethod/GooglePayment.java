package com.ewch.java.design.patterns.creational.factoryMethod;

public class GooglePayment implements Payment {

    @Override
    public void doPayment() {
        System.out.println("Paying with Google Payment...");
    }
}
