package com.ewch.java.design.patterns.behavioral.command;

public class CreditCard {

    public void sendPinNumberToCustomer() {
        System.out.println("Pin number has been sent to the client.");
    }

    public void sendSmsToCustomer() {
        System.out.println("Sms has been sent to the client reporting its card has been activated.");
    }

    public void activate() {
        System.out.println("The card has been activated.");
    }

    public void deactivate() {
        System.out.println("The card has been deactivated.");
    }

    public void sendSmsToCustomerDeactivate() {
        System.out.println("Sms has been sent to client reporting its card has been deactivated.");
    }
}
