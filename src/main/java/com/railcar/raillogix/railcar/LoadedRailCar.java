package com.railcar.raillogix.railcar;

import jakarta.persistence.Entity;

@Entity
public class LoadedRailCar {
    private Long railCarId;

    private Commodity commodity;

    public LoadedRailCar(Long railCarId, Commodity commodity) {
        this.railCarId = railCarId;
        this.commodity = commodity;
    }

}
