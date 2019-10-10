package com.ewch.java.design.patterns.structural.proxy;

public class AccessToInternet implements Internet {

    @Override
    public void connectTo(String url) throws Exception {
        System.out.println("Connecting to: " + url);
    }
}
