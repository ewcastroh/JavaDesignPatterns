package com.ewch.java.design.patterns.behavioral.mediator;

public abstract class Colleague {

    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void send(String message);

    public abstract void receiveMessage(String message);
}
