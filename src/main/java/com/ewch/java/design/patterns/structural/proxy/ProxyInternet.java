package com.ewch.java.design.patterns.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {

    private Internet internet = new AccessToInternet();
    private static List<String> bannedUrl;

    static {
        bannedUrl = new ArrayList<>();
        bannedUrl.add("twitter.com");
        bannedUrl.add("facebook.com");
        bannedUrl.add("google.com");
    }

    @Override
    public void connectTo(String url) throws Exception {
        if (bannedUrl.contains(url)) {
            throw new Exception("Blocked URL. Denied access. Ask for to admin.");
        }
        internet.connectTo(url);
    }
}
