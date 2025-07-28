package com.parkinglot.strategy;

public class PremiumRateStrategy implements ParkingFeeStrategy {
    public double calculateFee(int duration, DurationType type) {
        return duration * (type == DurationType.HOURS ? 12.0 : 120.0);
    }
}