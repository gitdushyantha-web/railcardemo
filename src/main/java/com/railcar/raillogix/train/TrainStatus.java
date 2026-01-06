package com.railcar.raillogix.train;

public enum TrainStatus {
    DELAYED("DELAYED");

    private String status;

    TrainStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }
}
