package com.railcar.raillogix.train;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrainRepository extends JpaRepository<Train, Long> {

    @Query(value = "SELECT ID, NAME from TRAIN WHERE ID = ?1", nativeQuery = true)
    Train findTrainById(Long trainId);


    @Modifying
    @Query(value = "UPDATE TRAIN SET LOCATION = ?1 WHERE ID = ?2", nativeQuery = true)
    Integer updateTrainLocationByTrainId(String stationCode, Long trainId);
}
