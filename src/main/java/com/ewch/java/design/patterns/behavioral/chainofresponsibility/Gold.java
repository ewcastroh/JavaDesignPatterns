package com.ewch.java.design.patterns.behavioral.chainofresponsibility;

public class Gold implements ApproveLoanChain {

    private ApproveLoanChain next;

    @Override
    public void setNext(ApproveLoanChain loan) {
        next = loan;
    }

    @Override
    public ApproveLoanChain getNext() {
        return next;
    }

    @Override
    public void creditCardRequest(int totalLoan) {
        if (totalLoan <= 10000) {
            System.out.println("This card request is managed by Gold Card.");
        } else {
            next.creditCardRequest(totalLoan);
        }
    }
}
