package com.parkinglot.models;

import java.util.List;

public class Spot extends BaseModel{
    private int spotNumber;
    private List<VehicleType> supportedVehicleTypesList;
    private SpotStatus spotStatus;
    private Vehicle vehicle;
    public List<VehicleType> getSupportedVehicleTypesList() {
        return supportedVehicleTypesList;
    }
    public void setSupportedVehicleTypesList(List<VehicleType> supportedVehicleTypesList) {
        this.supportedVehicleTypesList = supportedVehicleTypesList;
    }

    public SpotStatus getSpotStatus() {
        return spotStatus;
    }

    public void setSpotStatus(SpotStatus spotStatus) {
        this.spotStatus = spotStatus;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public void setSpotNumber(int spotNumber) {
        this.spotNumber = spotNumber;
    }
}
