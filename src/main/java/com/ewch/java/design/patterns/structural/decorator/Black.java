package com.ewch.java.design.patterns.structural.decorator;

public class Black implements Credit {

    @Override
    public void showCredit() {
        System.out.println("Value credit is 1.000.000");
    }
}
