package com.ewch.java.design.patterns.behavioral.observer;

public interface Subject {

    void attach(Observer observer);

    void detach(Observer observer);

    void notifyUpdate(Semaforo semaforo);
}
