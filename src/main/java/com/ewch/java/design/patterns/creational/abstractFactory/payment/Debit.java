package com.ewch.java.design.patterns.creational.abstractFactory.payment;

public class Debit implements PaymentMethod {

    @Override
    public String doPayment() {
        return "Debit Payment";
    }
}
