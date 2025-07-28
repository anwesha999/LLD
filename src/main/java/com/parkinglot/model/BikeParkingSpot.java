package com.parkinglot.model;

import com.parkinglot.model.enums.SpotType;

public class BikeParkingSpot extends ParkingSpot {
    public BikeParkingSpot(int spotNumber, String type) {
        super(spotNumber, SpotType.BIKE,false);
    }
}