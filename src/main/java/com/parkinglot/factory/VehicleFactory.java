package com.parkinglot.factory;

import com.parkinglot.model.*;
import com.parkinglot.strategy.ParkingFeeStrategy;

public class VehicleFactory {
    public static Vehicle createVehicle(String type, String number, ParkingFeeStrategy strategy) {
        return switch (type) {
            case "Car" -> new Car(number, strategy);
            case "Bike" -> new Bike(number, strategy);
            default -> throw new IllegalArgumentException("Invalid type: " + type);
        };
    }
}