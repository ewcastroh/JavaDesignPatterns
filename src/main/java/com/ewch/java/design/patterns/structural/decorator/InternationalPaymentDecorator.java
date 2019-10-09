package com.ewch.java.design.patterns.structural.decorator;

public class InternationalPaymentDecorator extends CreditDecorator {

    public InternationalPaymentDecorator(Credit decoratedCredit) {
        super(decoratedCredit);
    }

    @Override
    public void showCredit() {
        decoratedCredit.showCredit();
        configInternationalPayment();
    }

    private void configInternationalPayment() {
        System.out.println("Card has been configured to do international payments.");
    }
}
