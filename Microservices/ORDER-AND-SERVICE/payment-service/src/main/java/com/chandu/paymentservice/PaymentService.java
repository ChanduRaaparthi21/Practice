package com.chandu.paymentservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.UUID;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    public Payment doPayment(Payment payment){
        payment.setPaymentStatus(paymentProcessing());
        payment.setTransactionId(UUID.randomUUID().toString());
      return   paymentRepository.save(payment);
    }

    public String paymentProcessing(){
        return  new Random().nextBoolean()?"success":"failed";
    }

    public Payment findPaymentById(int orderId) {
        return paymentRepository.findByOrderId(orderId);
    }
}
