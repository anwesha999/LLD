package com.parkinglot.strategy;

public class CashPayment implements PaymentStrategy {
    private double amount;

    public CashPayment(double amount) {
        this.amount = amount;
    }

    public void processPayment(double amount) {
        System.out.println("Processing cash payment of $" + amount);
    }
}