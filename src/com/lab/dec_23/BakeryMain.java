package com.lab.dec_23;

public class BakeryMain {

	public static void main(String[] args) 
	{
		Bakery foodGood = new Bakery(0, 0);
		Baker ramu = new Baker(foodGood);
		Customer Vikram = new Customer(foodGood, "Vikram");
		Thread bakerThread = new Thread(ramu);
		Thread customerThread = new Thread(Vikram);
		bakerThread.start();
		customerThread.start();
		
		/**
		 * 

Instantiate the Bakery class.

Create and start one Baker thread by passing the Bakery instance to the Baker class.

Create and start multiple Customer threads by passing the Bakery instance to each Customer instance.

Ensure the main class waits for the baker to finish baking and all customer threads to finish buying goods before exiting.

		 */
	}

}
