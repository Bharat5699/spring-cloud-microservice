package com.example.payment.model;

import java.util.Date;
import java.util.UUID;

public class Payment {
	
	private UUID transactionId;
	private int amount;
	private Date transactionDate;
	private String status;
	
	public Payment(UUID transactionId, int amount, Date transactionDate, String status) {
		super();
		this.transactionId = transactionId;
		this.amount = amount;
		this.transactionDate = transactionDate;
		this.status = status;
	}
	
	
	
	public Payment() {
		super();
	}



	public UUID getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(UUID transactionId) {
		this.transactionId = transactionId;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
