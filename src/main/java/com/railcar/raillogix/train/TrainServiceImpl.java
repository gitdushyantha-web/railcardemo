package com.railcar.raillogix.train;

import org.springframework.stereotype.Service;

@Service
public class TrainServiceImpl implements TrainService {

    private final NotificationService notificationService;

    private final TrainRepository trainRepository;

    public TrainServiceImpl(NotificationService notificationService,
                            TrainRepository trainRepository) {
        this.trainRepository = trainRepository;
        this.notificationService = notificationService;
    }

    /**
     * Update train location with station.
     * If train is delayed location is not updated. Only notification message sent.
     * @param stationCode
     * @param trainId
     * @return Boolean
     */
    @Override
    public Boolean updateTrainLocationAndNotify(String stationCode, Long trainId) {
        Train train = trainRepository.findTrainById(trainId);
        if(train.getTrainStatus() == TrainStatus.DELAYED) {
            notificationService.alert(TrainConstants.TRAIN_DELAY_MSG);
            return Boolean.FALSE;
        }
        trainRepository.updateTrainLocationByTrainId(stationCode, trainId);
        return Boolean.TRUE;
    }
}
