package com.driver.controllers;

import com.driver.model.Payment;
import com.driver.services.impl.PaymentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/payment")
public class PaymentController {

    @Autowired
    PaymentServiceImpl paymentService;

    @PostMapping("/pay")
    public Payment pay(@RequestParam Integer reservationId, @RequestParam Integer amountSent, @RequestParam String mode) throws Exception {
        // Attempt a payment of amountSent for reservationId using the given mode ("cASh", "card", or "upi")

        // Validate the payment mode
        String lowercaseMode = mode.toLowerCase();
        if (!lowercaseMode.equals("cash") && !lowercaseMode.equals("card") && !lowercaseMode.equals("upi")) {
            throw new Exception("Payment mode not detected");
        }

        // Call the payment service to process the payment
        Payment payment = paymentService.processPayment(reservationId, amountSent, lowercaseMode);

        // If the amountSent is less than the bill, throw "Insufficient Amount" exception
        if (payment == null) {
            throw new Exception("Insufficient Amount");
        }

        // Update payment attributes
        return payment;
    }
}
