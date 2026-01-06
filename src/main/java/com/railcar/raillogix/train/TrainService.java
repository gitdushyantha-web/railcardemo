package com.railcar.raillogix.train;

public interface TrainService {

    public Boolean updateTrainLocationAndNotify(String stationCode, Long trainId);
}
