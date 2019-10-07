package com.ewch.java.design.patterns.behavioral.strategy;

public class CapitalStrategyTextFormatter implements StrategyTextFormatter {

    @Override
    public void format(String text) {
        System.out.println("Text in uppercase: " + text.toUpperCase());
    }
}
