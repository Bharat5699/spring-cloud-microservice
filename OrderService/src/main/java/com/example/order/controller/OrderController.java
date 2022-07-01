package com.example.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.order.model.Order;

@RestController
public class OrderController {
	
	@GetMapping("/order")
	public Order getOrder() {
		Order order=new Order();
		order.setId(1);
		order.setName("mobiles");
		order.setPrice(15000);
		order.setQty(3);
		return order;
	}
}
