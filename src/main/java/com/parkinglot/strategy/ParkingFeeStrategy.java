package com.parkinglot.strategy;

public interface ParkingFeeStrategy {
    double calculateFee(int duration, DurationType type);
}