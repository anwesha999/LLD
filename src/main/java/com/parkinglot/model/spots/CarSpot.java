package com.parkinglot.model.spots;

import com.parkinglot.model.ParkingSpot;
import com.parkinglot.model.enums.SpotType;

public class CarSpot extends ParkingSpot {
    public CarSpot(int number) {
        super(number,SpotType.CAR,false);
    }
}