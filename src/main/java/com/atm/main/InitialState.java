package com.atm.main;


import com.atm.model.ATMCard;
import com.atm.service.ATMState;

    public class InitialState implements ATMState {

        @Override
        public void insertCard(ATM atm) {
            ATMCard card = atm.getCard();
            if (atm.getCardReader().readCard(card)) {
                atm.getScreen().display("Card inserted.");
            }
        }

        @Override
        public void ejectCard(ATM atm) {
            atm.getScreen().display("Card ejected.");
        }

        @Override
        public void enterPin(ATM atm, String pin) {
            if (atm.getCard().validatePin(pin)) {
                atm.getScreen().display("PIN validated.");
            } else {
                atm.getScreen().display("Invalid PIN.");
            }
        }

        @Override
        public void withdrawCash(ATM atm, double amount) {
            boolean success = atm.getCashDispenser().dispenseCash(amount);
            if (success) {
                atm.getScreen().display("Please collect your cash.");
            }
        }
    }


