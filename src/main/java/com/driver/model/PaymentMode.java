package com.driver.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer amount;
    private String mode;
    private Date paymentDate;

    @ManyToOne
    @JoinColumn(name = "reservation_id")
    private Reservation reservation;

    // Define getters/setters as needed
}
