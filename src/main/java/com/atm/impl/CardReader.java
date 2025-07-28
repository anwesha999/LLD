package com.atm.impl;

// class CardReader logic goes here


import com.atm.model.ATMCard;

public class CardReader {
    public boolean readCard(ATMCard card) {
        System.out.println("Reading card: " + card.getCardNumber());
        return true;
    }
}
