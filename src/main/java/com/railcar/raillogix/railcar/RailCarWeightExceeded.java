package com.railcar.raillogix.railcar;

public class RailCarWeightExceeded extends Exception {
    public RailCarWeightExceeded(Long railId, String commodityName) {
        super("Cannot load commodity "+commodityName+ " : weight exceeds rail car maximum capacity.");
    }
}
