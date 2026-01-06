package com.railcar.raillogix.train;

import jakarta.persistence.*;

@Entity
@Table(name = "TRAIN")
public class Train {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id; //Primary Key

    @Column(name = "NAME")
    private String name; // Train name

    @Column(name = "LOCATION")
    private String location;

    private TrainStatus trainStatus = TrainStatus.DELAYED;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public TrainStatus getTrainStatus() {
        return trainStatus;
    }

    public void setTrainStatus(TrainStatus trainStatus) {
        this.trainStatus = trainStatus;
    }
}
