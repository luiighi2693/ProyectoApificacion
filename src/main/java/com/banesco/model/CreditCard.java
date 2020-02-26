package com.banesco.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreditCard{
	
	private String id;
	private String label;
	private String number;
	private String balance;
	private String status;
	private String type;

	@JsonProperty("credit_card_id")
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@JsonProperty("credit_card_label")
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	@JsonProperty("credit_card_number")
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	@JsonProperty("credit_card_balance")
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	@JsonProperty("credit_card_status")
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@JsonProperty("credit_card_type")
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}


}
