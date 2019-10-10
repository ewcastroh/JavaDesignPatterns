package com.ewch.java.design.patterns.structural.facade;

public class Silver implements Credit {

    @Override
    public void showCredit() {
        System.out.println("Gold Card has a credit of 200.000");
    }
}
