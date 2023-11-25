package com.parkinglot.models;

import java.util.List;

public class Floor extends BaseModel{
    private int floorNumber;
    private List<Spot> spots;

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public List<Spot> getSpots() {
        return spots;
    }

    public void setSpots(List<Spot> spots) {
        this.spots = spots;
    }
}
