package com.atm.service;

// class ATMState logic goes here

import com.atm.main.ATM;

public interface ATMState {
    void insertCard(ATM atm);
    void ejectCard(ATM atm);
    void enterPin(ATM atm, String pin);
    void withdrawCash(ATM atm, double amount);
}
