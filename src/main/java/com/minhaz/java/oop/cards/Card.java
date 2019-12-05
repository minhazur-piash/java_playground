package com.minhaz.java.oop.cards;

public abstract class Card {
    private String holderFullName;

    // No default constructor in this class, subclass must call parameterized constructor explicitly.
    public Card(String holderFullName) {
        this.holderFullName = holderFullName;
    }

    public String getHolderFullName() {
        return holderFullName;
    }

    public void setHolderFullName(String holderFullName) {
        this.holderFullName = holderFullName;
    }
}
