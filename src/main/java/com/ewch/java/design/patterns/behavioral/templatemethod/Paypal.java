package com.ewch.java.design.patterns.behavioral.templatemethod;

public class Paypal extends Payment {

    @Override
    void initialize() {
        System.out.println("Initializing payment with Paypal...");
    }

    @Override
    void startPayment() {
        System.out.println("Paying with Paypal...");
    }

    @Override
    void endPayment() {
        System.out.println("Finishing payment with Paypal...");
    }
}
