package com.ewch.java.design.patterns.creational.factoryMethod;

public class PaymentFactory {

    public static Payment buildPayment(PaymentType paymentType) {

        return switch (paymentType) {

            case CARD -> new CardPayment();
            case GOOGLE_PAYMENT -> new GooglePayment();
            default -> new CardPayment();
        };
    }
}
