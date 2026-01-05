package com.railcar.raillogix.railcar;

import org.springframework.stereotype.Service;

@Service
public class CargoLoadingService {
    private final CommodityRepository commodityRepository;
    private final RailCarRepository railCarRepository;

    public CargoLoadingService(final CommodityRepository commodityRepository,
                               final RailCarRepository railCarRepository) {
        this.commodityRepository = commodityRepository;
        this.railCarRepository = railCarRepository;
    }

    /*
     * Load the rail car with the commodity
     * One rail car can have only one industrial commodity
     * @param Rail car id and commodity object.
     * @throws RailCarStateException
     *      if rail care is moving.
     * @throws RailCarWeightExceeded
     *      if commodity weight exceeds rail car maximum capacity.
     * @return LoadedRailCar object containing rail car id and commodity object.
     */
    private LoadedRailCar loadCargo(Long railCarId, Commodity commodity)throws RailCarStateException,
            RailCarWeightExceeded{
        RailCar railCar = railCarRepository.findById(railCarId).get();

        if(railCar.getCurrentStatus() == CurrentStatus.MOVING) {
            throw new RailCarStateException(railCarId, commodity.getName());
        }

        if(railCar.getMaximumWeightCapacity() < commodity.getWeight()) {
            throw new RailCarWeightExceeded(railCarId, commodity.getName());
        }

        return new LoadedRailCar(railCarId, commodity);
    }

}
