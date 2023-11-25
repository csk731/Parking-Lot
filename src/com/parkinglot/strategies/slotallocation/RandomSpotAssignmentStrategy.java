package com.parkinglot.strategies.slotallocation;

import com.parkinglot.models.*;

import java.util.List;

public class RandomSpotAssignmentStrategy implements SpotAllocationStrategy {

    @Override
    public Spot assignSpot(ParkingLot parkingLot, VehicleType vehicleType) {
        for(Floor floor:parkingLot.getFloors()){
            for(Spot spot:floor.getSpots()){
                if (spot.getSpotStatus().equals(SpotStatus.EMPTY) && spot.getSupportedVehicleTypesList().contains(vehicleType)){
                    return spot;
                }
            }
        }
        return null;
    }
}
