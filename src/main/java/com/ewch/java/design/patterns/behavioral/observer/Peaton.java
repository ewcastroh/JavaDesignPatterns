package com.ewch.java.design.patterns.behavioral.observer;

public class Peaton implements Observer {

    @Override
    public void update(Semaforo semaforo) {
        if (semaforo.status.equalsIgnoreCase("ROJO_COCHE")) {
            System.out.println("Semaforo is VERDE to peaton -> PEATON CAN cross.");
        } else {
            System.out.println("Semaforo is ROJO to peaton -> PEATON CANNOT cross.");
        }
    }
}
