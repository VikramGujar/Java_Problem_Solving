package com.lab.dec_24;

public class PetrolPumpSimulation {

	public static void main(String[] args) 
	{
		//object creation for PetrolPump  
		PetrolPump pmp = new PetrolPump();
		
		// Creating runnable type of objects to start threads
		Car bmw = new Car("BMW", pmp);
		Car rr = new Car("RR", pmp);
		Car tata = new Car("TaTa", pmp);
		
		
		// New threads created for every car 
		Thread bmwThread = new Thread(bmw);
		Thread rrThread = new Thread(rr);
		Thread tataThread = new Thread(tata);
		
		// start method to get threads from NEW to RUNNABLE state
		bmwThread.start();
		rrThread.start();
		tataThread.start();

	}

}
/*
 * 
In the main method, create an instance of PetrolPump.
Create an array of Car objects, each initialized with a unique name and the reference to the petrol pump.
Create an array of Thread objects to represent each car's thread.
Start each car thread and wait for all car threads to complete using the join method.
*/
