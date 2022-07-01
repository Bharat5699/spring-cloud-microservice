package com.example.payment.controller;

import java.util.Date;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.payment.model.Payment;

@RestController
public class PaymentController {
	
	@GetMapping("/payment")
	public Payment getPayment() {
		
		Payment payment=new Payment();
		payment.setAmount(500);
		payment.setTransactionId(UUID.randomUUID());
		payment.setTransactionDate(new Date());
		payment.setStatus("Success");
		return payment;
		
	}
	
	

}
