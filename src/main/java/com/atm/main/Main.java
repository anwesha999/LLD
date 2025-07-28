package com.atm.main;

// class Main logic goes here


import com.atm.model.ATMCard;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.setState(new InitialState());

        ATMCard card = new ATMCard("1234567890123456", "John Doe", "1234");

        atm.insertCard(card);
        atm.enterPin("1234");
        atm.withdrawCash(500);
        atm.ejectCard();
    }
}
