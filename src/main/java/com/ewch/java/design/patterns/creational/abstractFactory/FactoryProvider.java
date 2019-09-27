package com.ewch.java.design.patterns.creational.abstractFactory;

import com.ewch.java.design.patterns.creational.abstractFactory.card.CardFactory;
import com.ewch.java.design.patterns.creational.abstractFactory.payment.PaymentMethodFactory;

public class FactoryProvider {

    public static AbstractFactory getFactory(String chooseFactory) {
        if ("Card".equalsIgnoreCase(chooseFactory)) {
            return new CardFactory();
        } else if ("PaymentMethod".equalsIgnoreCase(chooseFactory)) {
            return new PaymentMethodFactory();
        }
        return null;
    }
}
