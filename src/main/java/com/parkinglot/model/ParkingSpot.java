package com.parkinglot.model;

import com.parkinglot.model.enums.SpotType;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
public abstract class ParkingSpot {
    private int spotNumber;
    private SpotType type;
    private boolean occupied;
}