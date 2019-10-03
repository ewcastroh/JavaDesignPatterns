package com.ewch.java.design.patterns.behavioral.iterator;

public class CardList implements List {

    private Card[] cards;

    public CardList(Card[] cards) {
        this.cards = cards;
    }

    @Override
    public Iterator iterator() {
        return new CardIterator(cards);
    }
}
