package com.railcar.raillogix.railcar;

public class RailCarStateException extends Exception {

    public RailCarStateException(Long railId, String commodityName) {
        super("Cannot load goods " + commodityName + " because the rail car "+railId+" is in MOVING state.");
    }
}
