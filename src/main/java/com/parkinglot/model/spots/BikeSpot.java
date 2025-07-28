package com.parkinglot.model.spots;

import com.parkinglot.model.ParkingSpot;
import com.parkinglot.model.enums.SpotType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class BikeSpot extends ParkingSpot {
    public BikeSpot(int number) {
        super(number, SpotType.BIKE,false);
    }
}