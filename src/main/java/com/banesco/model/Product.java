package com.banesco.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Product {
	private List<Account> account;
	private List<CreditCard> creditCard;
	
	public List<Account> getAccount() {
		return account;
	}
	public void setAccount(List<Account> account) {
		this.account = account;
	}
	@JsonProperty("credit_card")
	public List<CreditCard> getCreditCard() {
		return creditCard;
	}
	public void setCreditCard(List<CreditCard> creditCard) {
		this.creditCard = creditCard;
	}
}
