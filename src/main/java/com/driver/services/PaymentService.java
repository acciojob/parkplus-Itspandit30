package com.driver.services.impl;

import com.driver.model.ParkingLot;
import com.driver.model.Spot;
import com.driver.services.ParkingLotService;
import org.springframework.stereotype.Service;

@Service
public class ParkingLotServiceImpl implements ParkingLotService {

    @Override
    public void deleteSpot(int spotId) {
        // Implement spot deletion logic
    }

    @Override
    public Spot updateSpot(int parkingLotId, int spotId, int pricePerHour) {
        // Implement spot update logic
        return updatedSpot;
    }

    @Override
    public void deleteParkingLot(int parkingLotId) {
        // Implement parking lot deletion logic
    }

    @Override
    public ParkingLot addParkingLot(String name, String address) {
        // Implement parking lot creation logic
        return newParkingLot;
    }

    @Override
    public Spot addSpot(int parkingLotId, Integer numberOfWheels, Integer pricePerHour) {
        // Implement spot creation logic
        return newSpot;
    }
}
