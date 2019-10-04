package com.ewch.java.design.patterns;

import com.ewch.java.design.patterns.behavioral.chainofresponsibility.Tarjeta;
import com.ewch.java.design.patterns.behavioral.command.CreditCard;
import com.ewch.java.design.patterns.behavioral.command.CreditCardActivateCommand;
import com.ewch.java.design.patterns.behavioral.command.CreditCardDeactivateCommand;
import com.ewch.java.design.patterns.behavioral.command.CreditCardInvoker;
import com.ewch.java.design.patterns.behavioral.iterator.CardList;
import com.ewch.java.design.patterns.behavioral.iterator.Iterator;
import com.ewch.java.design.patterns.behavioral.iterator.List;
import com.ewch.java.design.patterns.behavioral.mediator.ConcreteColleague1;
import com.ewch.java.design.patterns.behavioral.mediator.ConcreteColleague2;
import com.ewch.java.design.patterns.behavioral.mediator.ConcreteMediator;
import com.ewch.java.design.patterns.creational.abstractFactory.AbstractFactory;
import com.ewch.java.design.patterns.creational.abstractFactory.FactoryProvider;
import com.ewch.java.design.patterns.creational.abstractFactory.card.Card;
import com.ewch.java.design.patterns.creational.abstractFactory.payment.PaymentMethod;
import com.ewch.java.design.patterns.creational.factoryMethod.Payment;
import com.ewch.java.design.patterns.creational.factoryMethod.PaymentFactory;
import com.ewch.java.design.patterns.creational.factoryMethod.PaymentType;
import com.ewch.java.design.patterns.creational.prototype.PrototypeCard;
import com.ewch.java.design.patterns.creational.prototype.PrototypeFactory;

/**
 * Java Design Patterns
 */
public class App 
{
    public static void main( String[] args )
    {
        // JAVA DESIGN PATTERNS
        System.out.println("****************************");
        System.out.println("*** JAVA DESIGN PATTERNS ***");
        System.out.println("****************************");
        System.out.println();


        // CREATIONAL PATTERNS
        System.out.println("***************************");
        System.out.println("*** CREATIONAL PATTERNS ***");
        System.out.println("***************************");
        System.out.println();

        // Factory Method
        // testFactoryMethod();

        // Abstract Factory
        // testAbstractFactory();

        // Builder
        // testBuilder();

        // Prototype
        // testPrototype();

        // Singleton
        // testSingleton();


        // BEHAVIORAL PATTERNS
        System.out.println("***************************");
        System.out.println("*** BEHAVIORAL PATTERNS ***");
        System.out.println("***************************");
        System.out.println();

        // Chain of Responsibility
        // testChangeOfResponsibility();

        // Command
        // testCommand();

        // Iterator
        // testIterator();

        // Mediator
        testMediator();
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

    // Builder
    private static void testBuilder() {
        System.out.println("--- BUILDER ---");

        com.ewch.java.design.patterns.creational.builder.Card card1 =
                new com.ewch.java.design.patterns.creational.builder.Card.CardBuilder("VISA", "0123 4567 8910 VISA")
                        .name("Eimer")
                        .expires(2030)
                        .credit(true)
                        .build();
        System.out.println("Builder");
        System.out.println("Card 1:");
        System.out.println(card1);

        com.ewch.java.design.patterns.creational.builder.Card card2 =
                new com.ewch.java.design.patterns.creational.builder.Card.CardBuilder("MASTERCARD", "0987 6543 2100 MSTR")
                        .build();
        System.out.println("Card 2:");
        System.out.println(card2);
    }

    // Prototype
    private static void testPrototype() {
        System.out.println("--- PROTOTYPE ---");

        PrototypeFactory.loadCard();
        try {
            PrototypeCard visa = PrototypeFactory.getInstance(PrototypeFactory.CartType.VISA);
            visa.getCard();
            PrototypeCard mastercard = PrototypeFactory.getInstance(PrototypeFactory.CartType.MASTERCARD);
            mastercard.getCard();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    // Singleton
    private static void testSingleton() {
        System.out.println("--- SINGLETON ---");

        com.ewch.java.design.patterns.creational.singleton.Card card = com.ewch.java.design.patterns.creational.singleton.Card.getInstance();
        card.setCardNumber("0132 4567 8910");
        System.out.println("Card number: " + card.getCardNumber());
    }


    // BEHAVIORAL PATTERNS

    // Chain of Responsibility
    private static void testChangeOfResponsibility() {
        System.out.println("--- CHAIN OF RESPONSIBILITY ---");

        Tarjeta tarjeta = new Tarjeta();
        tarjeta.creditCardRequest(500000);
    }

    // Command
    private static void testCommand() {
        System.out.println("--- COMMAND ---");

        CreditCard creditCard = new CreditCard();
        CreditCard creditCardDeactivate = new CreditCard();
        CreditCardInvoker invoker = new CreditCardInvoker();

        System.out.println("- Activate Command -");
        invoker.setCommand(new CreditCardActivateCommand(creditCard));
        invoker.run();

        System.out.println("- Deactivate Command -");
        invoker.setCommand(new CreditCardDeactivateCommand(creditCardDeactivate));
        invoker.run();
    }

    // Iterator
    private static void testIterator() {
        System.out.println("--- ITERATOR ---");

        com.ewch.java.design.patterns.behavioral.iterator.Card[] cards = new com.ewch.java.design.patterns.behavioral.iterator.Card[5];
        cards[0] = new com.ewch.java.design.patterns.behavioral.iterator.Card("VISA");
        cards[1] = new com.ewch.java.design.patterns.behavioral.iterator.Card("AMEX");
        cards[2] = new com.ewch.java.design.patterns.behavioral.iterator.Card("MASTERCARD");
        cards[3] = new com.ewch.java.design.patterns.behavioral.iterator.Card("DINNERS CLUB");
        cards[4] = new com.ewch.java.design.patterns.behavioral.iterator.Card("AMERICAN EXPRESS");

        List list = new CardList(cards);
        Iterator iterator = list.iterator();

        while (iterator.hasNext()) {
            com.ewch.java.design.patterns.behavioral.iterator.Card tarjeta = (com.ewch.java.design.patterns.behavioral.iterator.Card) iterator.next();
            System.out.println("Card: " + tarjeta.getType());
        }
    }

    // Mediator
    private static void testMediator() {
        System.out.println("--- MEDIATOR ---");

        ConcreteMediator mediator = new ConcreteMediator();
        ConcreteColleague1 user1 = new ConcreteColleague1(mediator);
        ConcreteColleague2 user2 = new ConcreteColleague2(mediator);
        mediator.setUser1(user1);
        mediator.setUser2(user2);
        user1.send("Hi, I'm user1");
        user2.send("Hi user1, I'm user2");
    }

}
