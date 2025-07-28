package com.atm.main;

// class ATM logic goes here



import com.atm.impl.*;
import com.atm.model.ATMCard;
import com.atm.service.ATMState;

public class ATM {
    private ATMCard card;
    private ATMState currentState;

    private final CardReader cardReader = new CardReader();
    private final CashDispenser cashDispenser = new CashDispenser();
    private final Keypad keypad = new Keypad();
    private final Screen screen = new Screen();

    public void setState(ATMState state) {
        this.currentState = state;
    }

    public ATMState getState() {
        return currentState;
    }

    public void insertCard(ATMCard card) {
        this.card = card;
        currentState.insertCard(this);
    }

    public void ejectCard() {
        this.card = null;
        currentState.ejectCard(this);
    }

    public void enterPin(String pin) {
        currentState.enterPin(this, pin);
    }

    public void withdrawCash(double amount) {
        currentState.withdrawCash(this, amount);
    }

    public ATMCard getCard() {
        return this.card;
    }

    public CardReader getCardReader() {
        return cardReader;
    }

    public CashDispenser getCashDispenser() {
        return cashDispenser;
    }

    public Keypad getKeypad() {
        return keypad;
    }

    public Screen getScreen() {
        return screen;
    }
}
