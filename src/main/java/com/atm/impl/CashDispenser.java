package com.atm.impl;

// class CashDispenser logic goes here


public class CashDispenser {
    private double availableCash = 10000;

    public boolean dispenseCash(double amount) {
        if (availableCash >= amount) {
            availableCash -= amount;
            System.out.println("Dispensed: " + amount);
            return true;
        }
        System.out.println("Insufficient cash in ATM.");
        return false;
    }
}
