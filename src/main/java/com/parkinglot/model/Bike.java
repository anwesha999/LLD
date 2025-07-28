package com.parkinglot.model;
import com.parkinglot.model.enums.SpotType;
import com.parkinglot.strategy.ParkingFeeStrategy;

public class Bike extends Vehicle {
    public Bike(String number, ParkingFeeStrategy strategy) {
        super(number, SpotType.BIKE, strategy);
    }
}