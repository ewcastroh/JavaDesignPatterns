package com.ewch.java.design.patterns.creational.abstractFactory.payment;

import com.ewch.java.design.patterns.creational.abstractFactory.AbstractFactory;

public class PaymentMethodFactory implements AbstractFactory<PaymentMethod> {

    @Override
    public PaymentMethod create(String type) {
        if ("CREDIT".equalsIgnoreCase(type)) {
            return new Credit();
        } else if ("DEBIT".equalsIgnoreCase(type)) {
            return new Debit();
        }
        return null;
    }
}
