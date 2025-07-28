package com.parkinglot.model.spots;

import com.parkinglot.model.ParkingSpot;
import com.parkinglot.model.enums.SpotType;

public class TruckSpot extends ParkingSpot {
    public TruckSpot(int number) {
        super(number, SpotType.TRUCK,false);
    }
}