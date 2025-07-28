package com.parkinglot.service;

import com.parkinglot.model.*;

import java.util.List;

public class ParkingLot {
    private List<ParkingSpot> spots;

    public ParkingLot(List<ParkingSpot> spots) {
        this.spots = spots;
    }

    public ParkingSpot parkVehicle(Vehicle vehicle) {
        for (ParkingSpot spot : spots) {
            if (!spot.isOccupied() && spot.getType()==vehicle.getType()) {
                spot.setOccupied(true);
                System.out.println(vehicle.getType() + " parked successfully in spot: " + spot.getSpotNumber());
                return spot;
            }
        }
        System.out.println("No available spot for " + vehicle.getType());
        return null;
    }

    public void vacateSpot(ParkingSpot spot, Vehicle vehicle) {
        spot.setOccupied(false);
        System.out.println(vehicle.getType() + " vacated the spot: " + spot.getSpotNumber());
    }
}