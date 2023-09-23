package com.driver.controllers;

import com.driver.model.ParkingLot;
import com.driver.model.Spot;
import com.driver.services.ParkingLotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/parking-lots")
public class ParkingLotController {

    @Autowired
    ParkingLotService parkingLotService;

    @PostMapping("/add")
    public ResponseEntity<ParkingLot> addParkingLot(@RequestParam String name, @RequestParam String address) {
        // Add a new parking lot to the database
        ParkingLot newParkingLot = parkingLotService.addParkingLot(name, address);
        return new ResponseEntity<>(newParkingLot, HttpStatus.CREATED);
    }

    @PostMapping("/{parkingLotId}/spot/add")
    public ResponseEntity<Spot> addSpot(@PathVariable int parkingLotId, @RequestParam Integer numberOfWheels, @RequestParam Integer pricePerHour) {
        // Create a new spot in the parkingLot with the given id
        Spot newSpot = parkingLotService.addSpot(parkingLotId, numberOfWheels, pricePerHour);
        return new ResponseEntity<>(newSpot, HttpStatus.CREATED);
    }

    @DeleteMapping("/spot/{spotId}/delete")
    public ResponseEntity<Void> deleteSpot(@PathVariable int spotId) {
        // Delete a spot from the given parking lot
        parkingLotService.deleteSpot(spotId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/{parkingLotId}/spot/{spotId}/update")
    public ResponseEntity<Spot> updateSpot(@PathVariable int parkingLotId, @PathVariable int spotId, @RequestParam int pricePerHour) {
        // Update the details of a spot
        Spot updatedSpot = parkingLotService.updateSpot(parkingLotId, spotId, pricePerHour);
        return new ResponseEntity<>(updatedSpot, HttpStatus.OK);
    }

    @DeleteMapping("/{parkingLotId}/delete")
    public ResponseEntity<Void> deleteParkingLot(@PathVariable int parkingLotId) {
        // Delete a parkingLot and all its spots
        parkingLotService.deleteParkingLot(parkingLotId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
