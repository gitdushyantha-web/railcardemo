package com.railcar.raillogix.railcar;

import jakarta.persistence.*;

@Entity
@Table(name = "RAIL_CAR")
public class RailCar {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id; //Primary Key

    @Column(name = "MAXIMUM_WEIGHT_CAPACITY")
    private Double maximumWeightCapacity= 0.0; // Maximum Weight Capacity

    @Column(name = "CURRENT_STATUS")
    @Enumerated(EnumType.STRING)
    private CurrentStatus currentStatus = CurrentStatus.IDLE; // Current RailCar Status

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getMaximumWeightCapacity() {
        return maximumWeightCapacity;
    }

    public void setMaximumWeightCapacity(Double maximumWeightCapacity) {
        this.maximumWeightCapacity = maximumWeightCapacity;
    }

    public CurrentStatus getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(CurrentStatus currentStatus) {
        this.currentStatus = currentStatus;
    }
}
