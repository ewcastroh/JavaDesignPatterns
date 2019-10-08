package com.ewch.java.design.patterns.behavioral.templatemethod;

public class Visa extends Payment {

    @Override
    void initialize() {
        System.out.println("Initializing payment with Visa...");
    }

    @Override
    void startPayment() {
        System.out.println("Paying with Visa...");
    }

    @Override
    void endPayment() {
        System.out.println("Finishing payment with Visa...");
    }
}
