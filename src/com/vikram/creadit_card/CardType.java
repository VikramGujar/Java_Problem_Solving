package com.vikram.creadit_card;

public class CardType {

	private Customer customer;
	private String cardType;
	
	public CardType(Customer customer, String cardType) {
		super();
		this.customer = customer;
		this.cardType = cardType;
	}

	@Override
	public String toString() {
		return "The Customer '"+this.customer+"' Is Eligible For '"+this.cardType+"' Card.";
	}
	
	
	
	
	
	

}
