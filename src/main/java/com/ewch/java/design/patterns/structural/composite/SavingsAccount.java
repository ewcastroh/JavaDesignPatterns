package com.ewch.java.design.patterns.structural.composite;

public class SavingsAccount implements AccountComponent {

    private String name;
    private Double amount;

    public SavingsAccount(String name, Double amount) {
        this.name = name;
        this.amount = amount;
    }

    @Override
    public void showAccountName() {
        System.out.println("SaveAccount: " + name);
    }

    @Override
    public Double getAmount() {
        return amount;
    }
}
