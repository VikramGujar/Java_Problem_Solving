package com.vikram.interface_programs;

	 class PayPal extends OnlinePayment {
	 private String email;

	 PayPal(String paymentId, String email) {
	     super(paymentId);
	     this.email = email;
	 }

	 @Override
	 public void makePayment(double amount) {
	     System.out.println("Processing PayPal Payment...");
	     System.out.println("Amount Paid: $" + amount);
	 }

	 @Override
	 public boolean validateDetails() {
	     System.out.println("Validating PayPal email: " + email);
	     return email.contains("@");  // Basic validation
	 }
	}

