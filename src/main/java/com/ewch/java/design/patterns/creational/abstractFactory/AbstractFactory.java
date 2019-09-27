package com.ewch.java.design.patterns.creational.abstractFactory;

public interface AbstractFactory<T> {

    T create(String type);
}
