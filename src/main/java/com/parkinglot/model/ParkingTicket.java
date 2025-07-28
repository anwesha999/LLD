package com.parkinglot.model;

import lombok.Data;

import java.time.Duration;
import java.time.LocalDateTime;

@Data
public class ParkingTicket {
    private static int counter = 1;
    private final int ticketId;
    private final LocalDateTime entryTime = LocalDateTime.now();
    private final ParkingSpot spot;
    private final Vehicle vehicle;

    public ParkingTicket(Vehicle vehicle, ParkingSpot spot) {
        this.ticketId = counter++;
        this.vehicle = vehicle;
        this.spot = spot;
    }

    public Duration getDuration() {
        return Duration.between(entryTime, LocalDateTime.now());
    }
}