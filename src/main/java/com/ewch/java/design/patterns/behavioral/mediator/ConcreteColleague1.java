package com.ewch.java.design.patterns.behavioral.mediator;

public class ConcreteColleague1 extends Colleague {

    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        mediator.send(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Colleague1 has received the next message: " + message);
    }
}
