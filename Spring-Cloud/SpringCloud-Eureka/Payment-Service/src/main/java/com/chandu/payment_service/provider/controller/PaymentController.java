package com.chandu.payment_service.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController {

	
	@GetMapping("/payNow/{price}")
	public String payNow(@PathVariable int price) {
		return "Payment with "+price+" is succesfull";
	}
	
}
