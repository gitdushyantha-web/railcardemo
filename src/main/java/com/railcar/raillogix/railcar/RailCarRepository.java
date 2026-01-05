package com.railcar.raillogix.railcar;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RailCarRepository extends JpaRepository<RailCar, Long> {
}
