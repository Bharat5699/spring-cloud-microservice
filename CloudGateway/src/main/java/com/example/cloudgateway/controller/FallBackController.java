package com.example.cloudgateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fallback")
public class FallBackController {

	@GetMapping("/order")
	public String orderFallBackMethod() {
		return "order service is down";
	}
	
	@GetMapping("/payment")
	public String paymentFallBackMethod() {
		return "payment service is down";
	}
	
}
