package com.vikram.interface_programs;

	 class CreditCard extends OnlinePayment implements Discount {
	 private String cardNumber;
	 private String cardHolder;

	 CreditCard(String paymentId, String cardNumber, String cardHolder) {
	     super(paymentId);
	     this.cardNumber = cardNumber;
	     this.cardHolder = cardHolder;
	 }

	 @Override
	 public void makePayment(double amount) {
	     System.out.println("Processing Credit Card Payment...");
	     System.out.println("Amount Paid: $" + amount);
	 }

	 @Override
	 public boolean validateDetails() {
	     System.out.println("Validating Credit Card details for " + cardHolder + "...");
	     return cardNumber.length() == 16;  // Basic validation
	 }

	 @Override
	 public double applyDiscount(double amount) {
	     double discount = 0.1;  // 10% discount
	     return amount - (amount * discount);
	 }
	}
