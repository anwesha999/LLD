package com.parkinglot.model;

import com.parkinglot.model.enums.SpotType;
import com.parkinglot.strategy.ParkingFeeStrategy;


public class Car extends Vehicle {
    public Car(String number, ParkingFeeStrategy strategy) {
        super(number, SpotType.CAR, strategy);
    }
}