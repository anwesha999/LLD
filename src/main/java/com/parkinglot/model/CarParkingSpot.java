package com.parkinglot.model;

import com.parkinglot.model.enums.SpotType;

public class CarParkingSpot extends ParkingSpot {
    public CarParkingSpot(int spotNumber, String type) {
        super(spotNumber, SpotType.CAR,false);
    }
}