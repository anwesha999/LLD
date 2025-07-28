package com.parkinglot.model;

import com.parkinglot.model.enums.SpotType;
import com.parkinglot.strategy.DurationType;
import com.parkinglot.strategy.ParkingFeeStrategy;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Vehicle {
    private String number;
    private SpotType type;
    private ParkingFeeStrategy feeStrategy;

    public double calculateFee(int duration, DurationType type) {
        return feeStrategy.calculateFee(duration, type);
    }
}