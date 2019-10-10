package com.ewch.java.design.patterns.structural.facade;

public class Black implements Credit {

    @Override
    public void showCredit() {
        System.out.println("Gold Card has a credit of 1.000.000");
    }
}
