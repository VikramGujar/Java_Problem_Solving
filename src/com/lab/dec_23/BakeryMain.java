package com.lab.dec_23;

public class BakeryMain {

	public static void main(String[] args) 
	{
		Bakery foodGood = new Bakery(10, 10);
		
		Baker ramu = new Baker(foodGood);
		Thread bakerThread = new Thread(ramu);
		bakerThread.start();
		
		Customer Vikram = new Customer(foodGood, "Vikram");
		Customer Harun = new Customer(foodGood, "Harun");
		Customer Sai = new Customer(foodGood, "Sai");
		
		Thread customerThread1 = new Thread(Vikram);
		Thread customerThread2 = new Thread(Harun);
		Thread customerThread3 = new Thread(Sai);
		
		
		customerThread1.start();
		customerThread2.start();
		customerThread3.start();
		
	}

}
