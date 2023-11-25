package com.parkinglot.strategies.slotallocation;

import com.parkinglot.models.ParkingLot;
import com.parkinglot.models.Spot;
import com.parkinglot.models.Vehicle;
import com.parkinglot.models.VehicleType;

public interface SpotAllocationStrategy {
    Spot assignSpot(ParkingLot parkingLot, VehicleType vehicleType);
}
