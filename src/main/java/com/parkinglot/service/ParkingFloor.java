package com.parkinglot.service;

import com.parkinglot.model.enums.VehicleType;
import com.parkinglot.model.enums.SpotType;
import com.parkinglot.model.spots.ParkingSpot;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ParkingFloor {
    private int floorNumber;
    private List<ParkingSpot> spots = new ArrayList<>();

    public ParkingSpot getAvailableSpot(VehicleType type) {
        SpotType requiredType = SpotType.valueOf(type.name());
        for (ParkingSpot spot : spots) {
            if (!spot.isOccupied() && spot.getType() == requiredType) {
                return spot;
            }
        }
        return null;
    }

    public void addSpot(ParkingSpot spot) {
        spots.add(spot);
    }
}