package com.ewch.java.design.patterns.behavioral.chainofresponsibility;

public interface ApproveLoanChain {

    void setNext(ApproveLoanChain loan);

    ApproveLoanChain getNext();

    void creditCardRequest(int totalLoan);
}
