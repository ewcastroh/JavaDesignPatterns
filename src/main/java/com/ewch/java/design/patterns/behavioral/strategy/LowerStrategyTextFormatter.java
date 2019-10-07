package com.ewch.java.design.patterns.behavioral.strategy;

public class LowerStrategyTextFormatter implements StrategyTextFormatter {

    @Override
    public void format(String text) {
        System.out.println("Text in lowercase: " + text.toLowerCase());
    }
}
