package com.ewch.java.design.patterns.creational.prototype;

public class Visa implements PrototypeCard {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public PrototypeCard clone() throws CloneNotSupportedException {
        System.out.println("Cloning VISA Card");
        return (Visa)super.clone();
    }

    @Override
    public void getCard() {
        System.out.println("This is a VISA Card.");
    }
}
