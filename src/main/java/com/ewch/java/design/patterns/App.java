package com.ewch.java.design.patterns;

import com.ewch.java.design.patterns.creational.factoryMethod.Payment;
import com.ewch.java.design.patterns.creational.factoryMethod.PaymentFactory;
import com.ewch.java.design.patterns.creational.factoryMethod.PaymentType;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        testFactoryMethod();
    }

    private static void testFactoryMethod() {
        Payment payment = PaymentFactory.buildPayment(PaymentType.GOOGLE_PAYMENT);
        payment.doPayment();
    }
}
