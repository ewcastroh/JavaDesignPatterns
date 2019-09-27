package com.ewch.java.design.patterns.creational.abstractFactory.payment;

public class Credit implements PaymentMethod {

    @Override
    public String doPayment() {
        return "Credit payment";
    }
}
