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
		customerThread1.start();
		
		Thread customerThread2 = new Thread(Harun);
		customerThread2.start();
		
		Thread customerThread3 = new Thread(Sai);
		customerThread3.start();
		

		try 
		{
			bakerThread.join();
			customerThread1.join();
			customerThread2.join();
			customerThread3.join();
			
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		 System.out.println("Bakery operation has finished for the day.");
		
	}

}
