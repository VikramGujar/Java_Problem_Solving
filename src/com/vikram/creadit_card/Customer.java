package com.vikram.creadit_card;

public class Customer {
	private String customerName;
	private int creditPoints;
	
	
	public Customer(String customerName, int creditPoints) {
		super();
		this.customerName = customerName;
		this.creditPoints = creditPoints;
	}
	
	public int getCreditPoints() 
	{		
		return this.creditPoints;
	}

	@Override
	public String toString() {
		return this.customerName;
	}
	
	
	
	
	
}
