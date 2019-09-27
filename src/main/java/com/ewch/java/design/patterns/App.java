package com.ewch.java.design.patterns;

import com.ewch.java.design.patterns.creational.abstractFactory.AbstractFactory;
import com.ewch.java.design.patterns.creational.abstractFactory.card.Card;
import com.ewch.java.design.patterns.creational.abstractFactory.FactoryProvider;
import com.ewch.java.design.patterns.creational.abstractFactory.payment.PaymentMethod;
import com.ewch.java.design.patterns.creational.factoryMethod.Payment;
import com.ewch.java.design.patterns.creational.factoryMethod.PaymentFactory;
import com.ewch.java.design.patterns.creational.factoryMethod.PaymentType;

/**
 * Java Design Patterns
 */
public class App 
{
    public static void main( String[] args )
    {
        // CREATIONAL PATTERNS
        System.out.println("****************************");
        System.out.println("*** JAVA DESIGN PATTERNS ***");
        System.out.println("****************************");
        System.out.println();

        // Factory Method
        // testFactoryMethod();

        // Abstract Factory
        testAbstractFactory();
    }


    // CREATIONAL PATTERNS

    // Factory Method
    private static void testFactoryMethod() {
        System.out.println("--- FACTORY METHOD ---");

        Payment payment = PaymentFactory.buildPayment(PaymentType.GOOGLE_PAYMENT);
        payment.doPayment();
    }

    // Abstract Factory
    private static void testAbstractFactory() {
        System.out.println("--- ABSTRACT FACTORY ---");

        AbstractFactory abstractFactoryCard = FactoryProvider.getFactory("Card");
        AbstractFactory abstractFactoryPaymentMethod = FactoryProvider.getFactory("PaymentMethod");

        PaymentMethod paymentMethod = (PaymentMethod) abstractFactoryPaymentMethod.create("DEBIT");
        Card card = (Card) abstractFactoryCard.create("VISA");

        System.out.println("Card Factory");
        System.out.println("Card type: " + card.getCardType());
        System.out.println("Card number: " + card.getCardNumber());
        System.out.println("Payment Method Factory");
        System.out.println("Payment Method: " + paymentMethod.doPayment());
    }

}
