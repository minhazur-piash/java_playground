package com.minhaz.java.oop.cards;

public class BusinessCard extends Card {

    public BusinessCard(String holderFullName) {
        // No default constructor in base class, subclass must call parameterized constructor explicitly.
        super(holderFullName);
    }
}
