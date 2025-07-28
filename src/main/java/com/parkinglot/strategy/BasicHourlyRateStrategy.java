package com.parkinglot.strategy;

public class BasicHourlyRateStrategy implements ParkingFeeStrategy {
    public double calculateFee(int duration, DurationType type) {
        return duration * (type == DurationType.HOURS ? 10.0 : 100.0);
    }
}