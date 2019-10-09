package com.ewch.java.design.patterns.structural.decorator;

public class SecureDecorator extends CreditDecorator {

    public SecureDecorator(Credit decoratedCredit) {
        super(decoratedCredit);
    }

    @Override
    public void showCredit() {
        decoratedCredit.showCredit();
        configSecurity();
    }

    private void configSecurity() {
        System.out.println("Card has been configured with highest security.");
    }
}
