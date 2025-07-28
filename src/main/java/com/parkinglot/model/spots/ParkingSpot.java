package com.parkinglot.model.spots;

import com.parkinglot.model.enums.SpotType;
import lombok.Data;

@Data
public abstract class ParkingSpot {
    private int number;
    private boolean occupied;

    public abstract SpotType getType();
}