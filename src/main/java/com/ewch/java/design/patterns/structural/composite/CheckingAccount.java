package com.ewch.java.design.patterns.structural.composite;

public class CheckingAccount implements AccountComponent {

    private String name;
    private Double amount;

    public CheckingAccount(String name, Double amount) {
        this.name = name;
        this.amount = amount;
    }

    @Override
    public void showAccountName() {
        System.out.println("CheckingAccount: " + name);
    }

    @Override
    public Double getAmount() {
        return amount;
    }
}
