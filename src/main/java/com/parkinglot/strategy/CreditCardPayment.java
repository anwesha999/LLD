package com.parkinglot.strategy;

public class CreditCardPayment implements PaymentStrategy {
    private double amount;

    public CreditCardPayment(double amount) {
        this.amount = amount;
    }

    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}