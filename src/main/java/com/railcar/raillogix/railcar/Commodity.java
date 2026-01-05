package com.railcar.raillogix.railcar;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "COMMODITY")
public class Commodity {

    @Column(name = "NAME")
    private String name; // Primary Key - Commodity name Eg: Coal or grain

    @Column(name = "WEIGHT")
    private Double weight = 0.0; // Commodity weight

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
}
