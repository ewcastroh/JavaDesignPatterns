package com.ewch.java.design.patterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {

    public static class CartType {
        public static final String VISA = "visa";
        public static final String MASTERCARD = "mastercard";
    }

    private static Map<String, PrototypeCard> prototypeCardMap = new HashMap<>();

    public static PrototypeCard getInstance(final String type) throws CloneNotSupportedException {
        return prototypeCardMap.get((type)).clone();
    }

    public static void loadCard() {
        Visa visa = new Visa();
        visa.setName("This is a Visa Card with number 0123 4567 7890");
        prototypeCardMap.put(CartType.VISA, visa);

        Mastercard mastercard = new Mastercard();
        mastercard.setName("This is a Mastercard Card with number 9876 5432 1010");
        prototypeCardMap.put(CartType.MASTERCARD, mastercard);
    }
}
