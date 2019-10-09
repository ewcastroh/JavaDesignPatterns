package com.ewch.java.design.patterns.structural.decorator;

public class Gold implements Credit {

    @Override
    public void showCredit() {
        System.out.println("Value credit is 50.000");
    }
}
