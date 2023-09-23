package com.driver.model;

import javax.persistence.*;

@Entity
public class Spot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer numberOfWheels;
    private Integer pricePerHour;

    @Enumerated(EnumType.STRING)
    private SpotType spotType;

    @ManyToOne
    @JoinColumn(name = "parking_lot_id")
    private ParkingLot parkingLot;

    // Define getters/setters as needed
}
