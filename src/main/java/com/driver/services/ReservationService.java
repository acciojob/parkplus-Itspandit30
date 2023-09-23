package com.driver.services.impl;

import com.driver.model.Reservation;
import com.driver.services.ReservationService;
import org.springframework.stereotype.Service;

@Service
public class ReservationServiceImpl implements ReservationService {

    @Override
    public Reservation reserveSpot(Integer userId, Integer parkingLotId, Integer timeInHours, Integer numberOfWheels) throws Exception {
        // Implement reservation logic
        return reservation;
    }
}
