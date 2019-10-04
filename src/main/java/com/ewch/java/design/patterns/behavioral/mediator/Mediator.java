package com.ewch.java.design.patterns.behavioral.mediator;

public interface Mediator {

    void send(String message, Colleague colleague);
}
