package com.ewch.java.design.patterns.behavioral.observer;

public class Coche implements Observer {

    @Override
    public void update(Semaforo semaforo) {
        if (semaforo.status.equalsIgnoreCase("ROJO_COCHE")) {
            System.out.println("Semaforo is ROJO to coche -> COCHE CANNOT cross.");
        } else {
            System.out.println("Semaforo is VERDE to coche -> COCHE CAN cross.");
        }
    }
}
