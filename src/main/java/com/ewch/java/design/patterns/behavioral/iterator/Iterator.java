package com.ewch.java.design.patterns.behavioral.iterator;

public interface Iterator {

    boolean hasNext();

    Object next();

    Object currentItem();
}
