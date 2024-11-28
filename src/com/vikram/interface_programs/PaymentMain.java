package com.vikram.interface_programs;



	public class PaymentMain {
			
	public static void main(String[] args) 
	{
		// Credit Card payment
		CreditCard cc = new CreditCard("TXN12345", "1234567812345678", "John Doe");
		if (cc.validateDetails()) 
		{
			cc.transactionDetails();
			double amountAfterDiscount = cc.applyDiscount(200.0);
			System.out.println("Amount after discount: $" + amountAfterDiscount);
			cc.makePayment(amountAfterDiscount);
		} else 
		{
         System.out.println("Invalid Credit Card details.");
		}

		System.out.println();

		// PayPal payment
		PayPal paypal = new PayPal("TXN67890", "johndoe@example.com");
		if (paypal.validateDetails()) {
         paypal.transactionDetails();
         paypal.makePayment(150.0);  // PayPal doesn't offer discounts
		} else 
		{
         System.out.println("Invalid PayPal details.");
		}
	}
}

