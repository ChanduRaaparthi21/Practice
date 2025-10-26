package com.chandu.orderservice;

import com.chandu.orderservice.common.Payment;
import com.chandu.orderservice.common.TransactionRequest;
import com.chandu.orderservice.common.TransactionResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {

    @Autowired
   private OrderRepository orderRepository;
    @Autowired
private RestTemplate restTemplate;


    public TransactionResponse saveOrder(TransactionRequest transactionRequest){
        String response="";
        Order order = transactionRequest.getOrder();
        Payment payment = transactionRequest.getPayment();
        payment.setOrderId(order.getId());
        payment.setAmount(order.getPrice());

   Payment paymentResponse = restTemplate.postForObject("http://PAYMENT-SERVICE/payment/doPayment",payment,Payment.class);

   response=paymentResponse.getPaymentStatus().equals("SUCCESS")?"payment processing successful and order placed":"there is a failure in payment api , order added to cart";

   orderRepository.save(order);
         return new TransactionResponse(order,paymentResponse.getAmount(),paymentResponse.getTransactionId(),response);
    }


}
