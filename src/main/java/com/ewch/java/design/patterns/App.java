package com.ewch.java.design.patterns;

import com.ewch.java.design.patterns.behavioral.chainofresponsibility.Tarjeta;
import com.ewch.java.design.patterns.behavioral.command.CreditCard;
import com.ewch.java.design.patterns.behavioral.command.CreditCardActivateCommand;
import com.ewch.java.design.patterns.behavioral.command.CreditCardDeactivateCommand;
import com.ewch.java.design.patterns.behavioral.command.CreditCardInvoker;
import com.ewch.java.design.patterns.behavioral.interpreter.AndExpression;
import com.ewch.java.design.patterns.behavioral.interpreter.Expression;
import com.ewch.java.design.patterns.behavioral.interpreter.OrExpression;
import com.ewch.java.design.patterns.behavioral.interpreter.TerminalExpression;
import com.ewch.java.design.patterns.behavioral.iterator.CardList;
import com.ewch.java.design.patterns.behavioral.iterator.Iterator;
import com.ewch.java.design.patterns.behavioral.iterator.List;
import com.ewch.java.design.patterns.behavioral.mediator.ConcreteColleague1;
import com.ewch.java.design.patterns.behavioral.mediator.ConcreteColleague2;
import com.ewch.java.design.patterns.behavioral.mediator.ConcreteMediator;
import com.ewch.java.design.patterns.behavioral.memento.Article;
import com.ewch.java.design.patterns.behavioral.memento.ArticleMemento;
import com.ewch.java.design.patterns.behavioral.memento.CareTaker;
import com.ewch.java.design.patterns.behavioral.observer.Coche;
import com.ewch.java.design.patterns.behavioral.observer.MessagePublisher;
import com.ewch.java.design.patterns.behavioral.observer.Peaton;
import com.ewch.java.design.patterns.behavioral.observer.Semaforo;
import com.ewch.java.design.patterns.behavioral.state.MobileAlertStateContext;
import com.ewch.java.design.patterns.behavioral.state.Silent;
import com.ewch.java.design.patterns.behavioral.state.Vibration;
import com.ewch.java.design.patterns.behavioral.strategy.CapitalStrategyTextFormatter;
import com.ewch.java.design.patterns.behavioral.strategy.Context;
import com.ewch.java.design.patterns.behavioral.strategy.LowerStrategyTextFormatter;
import com.ewch.java.design.patterns.behavioral.templatemethod.Paypal;
import com.ewch.java.design.patterns.behavioral.templatemethod.Visa;
import com.ewch.java.design.patterns.behavioral.visitor.*;
import com.ewch.java.design.patterns.creational.abstractFactory.AbstractFactory;
import com.ewch.java.design.patterns.creational.abstractFactory.FactoryProvider;
import com.ewch.java.design.patterns.creational.abstractFactory.card.Card;
import com.ewch.java.design.patterns.creational.abstractFactory.payment.PaymentMethod;
import com.ewch.java.design.patterns.creational.factoryMethod.Payment;
import com.ewch.java.design.patterns.creational.factoryMethod.PaymentFactory;
import com.ewch.java.design.patterns.creational.factoryMethod.PaymentType;
import com.ewch.java.design.patterns.creational.prototype.PrototypeCard;
import com.ewch.java.design.patterns.creational.prototype.PrototypeFactory;
import com.ewch.java.design.patterns.structural.bridge.ClassicCreditCard;
import com.ewch.java.design.patterns.structural.bridge.SecuredCreditCard;
import com.ewch.java.design.patterns.structural.bridge.UnsecuredCreditCard;
import com.ewch.java.design.patterns.structural.composite.AccountComponent;
import com.ewch.java.design.patterns.structural.composite.CheckingAccount;
import com.ewch.java.design.patterns.structural.composite.CompositeAccount;
import com.ewch.java.design.patterns.structural.composite.SavingsAccount;
import com.ewch.java.design.patterns.structural.decorator.*;
import com.ewch.java.design.patterns.structural.facade.CreditMarketFacade;

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
        // testMediator();

        // Memento
        // testMemento();

        // Observer
        // testObserver();

        // State
        // testState();

        // Interpreter
        // testInterpreter();

        // Strategy
        // testStrategy();

        // Template Method
        // testTemplateMethod();

        // Visitor
        // testVisitor();


        // STRUCTURAL PATTERNS
        System.out.println("***************************");
        System.out.println("*** STRUCTURAL PATTERNS ***");
        System.out.println("***************************");
        System.out.println();

        // Adapter
        // testAdapter();

        // Bridge
        // testBridge();

        // Composite
        // testComposite();

        // Decorator
        // testDecorator();

        // Facade
        testFacade();
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

    // Memento
    private static void testMemento() {
        System.out.println("--- MEMENTO ---");

        CareTaker careTaker = new CareTaker();
        Article article = new Article("Eimer", "Memento is a movie");
        article.setText(article.getText() + " from Nolan");
        System.out.println("Text from originator without memento: " + article.getText());

        careTaker.addMemento(article.createMemento());
        article.setText(article.getText() + " starred by Guy Pearce");
        System.out.println("Text after first createMemento without memento: " + article.getText());

        careTaker.addMemento(article.createMemento());
        System.out.println("Text after second memento: " + article.getText());

        article.setText(article.getText() + " and Leonardo DiCaprio");
        System.out.println("Text after a wrong added text: " + article.getText());

        ArticleMemento memento1 = careTaker.getMemento(0);
        ArticleMemento memento2 = careTaker.getMemento(1);

        article.restoreMemento(memento1);
        System.out.println("Restored text from memento1: " + article.getText());

        article.restoreMemento(memento2);
        System.out.println("Restored text from memento2: " + article.getText());

        article.setText(article.getText() + " from year XXXX");
        System.out.println("Newer state (Without memento): " + article.getText());
    }

    // Observer
    private static void testObserver() {
        System.out.println("--- OBSERVER ---");

        Coche coche = new Coche();
        Peaton peaton = new Peaton();
        MessagePublisher messagePublisher = new MessagePublisher();

        messagePublisher.attach(coche);
        messagePublisher.attach(peaton);
        messagePublisher.notifyUpdate(new Semaforo("ROJO_COCHE"));

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        messagePublisher.notifyUpdate(new Semaforo("VERDE_COCHE"));
    }

    // State
    private static void testState() {
        System.out.println("--- STATE ---");

        MobileAlertStateContext context = new MobileAlertStateContext();
        context.alert();
        context.alert();
        context.setCurrentState(new Vibration());
        context.alert();
        context.alert();
        context.setCurrentState(new Silent());
        context.alert();
        context.alert();
    }

    // Interpreter
    private static void testInterpreter() {
        System.out.println("--- INTERPRETER ---");

        Expression cero = new TerminalExpression("0");
        Expression uno = new TerminalExpression("1");

        Expression containBoolean = new OrExpression(cero, uno);
        Expression containOneAndCero = new AndExpression(cero, uno);

        System.out.println("containBoolean.interpret('cero'): " + containBoolean.interpret("cero"));
        System.out.println("containBoolean.interpret('0'): " + containBoolean.interpret("0"));

        System.out.println("containOneAndCero.interpret('0'): " + containOneAndCero.interpret("0"));
        System.out.println("containOneAndCero.interpret('0, 1'): " + containOneAndCero.interpret("0, 1"));
    }

    // Strategy
    private static void testStrategy() {
        System.out.println("--- STRATEGY ---");

        Context contextUpperCase = new Context(new CapitalStrategyTextFormatter());
        contextUpperCase.publishText("This text will be turn in UPPERCASE using the algorithm.");

        Context contextLowerCase = new Context(new LowerStrategyTextFormatter());
        contextLowerCase.publishText("THIS TEXT WILL BE TURN IN lowercase USING THE ALGORITHM.");
    }

    // Template Method
    private static void testTemplateMethod() {
        System.out.println("--- TEMPLATE METHOD ---");

        System.out.println("Payment with Visa:");
        com.ewch.java.design.patterns.behavioral.templatemethod.Payment paymentVisa = new Visa();
        paymentVisa.makePayment();

        System.out.println("Payment with Payment:");
        com.ewch.java.design.patterns.behavioral.templatemethod.Payment paymentPaypal = new Paypal();
        paymentPaypal.makePayment();
    }

    // Visitor
    private static void testVisitor() {
        System.out.println("--- VISITOR ---");

        System.out.println("Paying Gas with Black Card");
        ElementOffer elementOffer = new GasOffer();
        elementOffer.accept(new BlackCreditCardVisitor());

        System.out.println("Paying Fly with Classic Card");
        elementOffer = new FlyOffer();
        elementOffer.accept(new ClassicCreditCardVisitor());
    }


    // STRUCTURAL PATTERNS

    // Adapter
    private static void testAdapter() {
        System.out.println("--- ADAPTER ---");

        com.ewch.java.design.patterns.structural.adapter.CreditCard creditCard = new com.ewch.java.design.patterns.structural.adapter.CreditCard();
        creditCard.pay("classic");
        creditCard.pay("gold");
        creditCard.pay("black");
        creditCard.pay("silver");
    }

    // Bridge
    private static void testBridge() {
        System.out.println("--- BRIDGE ---");

        System.out.println("Payment with classic card with unsecured credit card.");
        com.ewch.java.design.patterns.structural.bridge.CreditCard unsecuredClassicCreditCard = new ClassicCreditCard(new UnsecuredCreditCard());
        unsecuredClassicCreditCard.doPayment();

        System.out.println("Payment with classic card with secured credit card.");
        com.ewch.java.design.patterns.structural.bridge.CreditCard securedClassicCreditCard = new ClassicCreditCard(new SecuredCreditCard());
        securedClassicCreditCard.doPayment();
    }

    // Composite
    private static void testComposite() {
        System.out.println("--- COMPOSITE ---");

        System.out.println("Creating Checking account...");
        AccountComponent checkingAccount = new CheckingAccount("Eimer", 1000.0);
        System.out.println("Checking account belongs to:");
        checkingAccount.showAccountName();
        System.out.println("Checking account with amount of : " + checkingAccount.getAmount());

        System.out.println("Creating Savings account...");
        AccountComponent savingsAccount = new SavingsAccount("Eimer", 20000.0);
        System.out.println("Savings account belongs to:");
        savingsAccount.showAccountName();
        System.out.println("Savings account with amount of : " + savingsAccount.getAmount());

        System.out.println("Composite Account:");
        CompositeAccount compositeAccount = new CompositeAccount();
        compositeAccount.addAccount(checkingAccount);
        compositeAccount.addAccount(savingsAccount);

        compositeAccount.showAccountName();
        compositeAccount.getAmount();
    }

    // Decorator
    private static void testDecorator() {
        System.out.println("--- DECORATOR ---");

        Credit gold = new Gold();
        Credit blackInternationalPayment = new Black();
        blackInternationalPayment = new InternationalPaymentDecorator(blackInternationalPayment);

        Credit goldSecureInternationalPayment = new Gold();
        goldSecureInternationalPayment = new InternationalPaymentDecorator(goldSecureInternationalPayment);
        goldSecureInternationalPayment = new SecureDecorator(goldSecureInternationalPayment);

        System.out.println("Gold card with configuration");
        gold.showCredit();

        System.out.println("Black card with configuration");
        blackInternationalPayment.showCredit();

        System.out.println("Gold2 card with configuration");
        goldSecureInternationalPayment.showCredit();
    }

    // Facade
    private static void testFacade() {
        System.out.println("--- FACADE ---");

        System.out.println("Creating Facade...");
        CreditMarketFacade creditMarketFacade = new CreditMarketFacade();
        System.out.println("Accessing showCreditCard from Gold Card using Facade.");
        creditMarketFacade.showCreditGold();
        System.out.println("Accessing showCreditCard from Silver Card using Facade.");
        creditMarketFacade.showCreditSilver();
        System.out.println("Accessing showCreditCard from Black Card using Facade.");
        creditMarketFacade.showCreditBlack();
    }
}
