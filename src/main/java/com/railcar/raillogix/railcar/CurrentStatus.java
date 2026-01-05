package com.railcar.raillogix.railcar;

public enum CurrentStatus {
    MOVING("MOVING"),
    IDLE("IDLE"),
    MAINTENANCE("MAINTENANCE");

    private final String status; // RailCar current status;

    CurrentStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }
}
