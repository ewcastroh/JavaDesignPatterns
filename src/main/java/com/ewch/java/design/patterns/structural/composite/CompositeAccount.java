package com.ewch.java.design.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeAccount implements AccountComponent {

    private List<AccountComponent> accountComponentListChild;

    public CompositeAccount() {
        this.accountComponentListChild = new ArrayList<>();
    }

    @Override
    public void showAccountName() {
        for (AccountComponent accountComponent: accountComponentListChild) {
            accountComponent.showAccountName();
        }
    }

    @Override
    public Double getAmount() {
        Double totalAmount = 0.0;
        for (AccountComponent accountComponent: accountComponentListChild) {
            totalAmount += accountComponent.getAmount();
        }
        System.out.println("Total amount: " + totalAmount);
        return totalAmount;
    }

    public void addAccount(AccountComponent accountComponent) {
        accountComponentListChild.add(accountComponent);
    }

    public void removeAccount(AccountComponent accountComponent) {
        accountComponentListChild.remove(accountComponent);
    }
}
