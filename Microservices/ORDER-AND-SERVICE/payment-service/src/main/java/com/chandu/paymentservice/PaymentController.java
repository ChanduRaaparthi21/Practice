package com.chandu.paymentservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
@RequestMapping("/payment")
public class PaymentController {


    @Autowired
    private PaymentService paymentService;


    @PostMapping("/doPayment")
    public Payment pay(@RequestBody Payment payment){
        return paymentService.doPayment(payment);
    }

    @GetMapping("/{orderId}")
    public Payment findPaymentById(@PathVariable int orderId){
        return paymentService.findPaymentById(orderId);
    }


}
