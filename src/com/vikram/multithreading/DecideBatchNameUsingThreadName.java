package com.vikram.multithreading;

import java.util.InputMismatchException;
import java.util.Scanner;

class BatchAssignment extends Thread
{
	@Override
	public void run()	// run() pre-defined method to run the task in new thread
	{
		String name = Thread.currentThread().getName();
		
		//equalsIgnoreCase() method will ignore case sensitivity
		if(name !=null && name.equalsIgnoreCase("Placement"))	
		{
			this.placementBatch();	// call will go to placementBatch method
		}
		else if(name !=null && name.equalsIgnoreCase("Regular"))
		{
			this.regularBatch();	// call will go to regularBatch method
		}
		else
		{
			//This exception will be thrown if the value is null 
			throw new NullPointerException("Name can't be null");
		}
	}
	
	public void placementBatch()
	{
		System.out.println("I am a placement batch student.");
	}
	
	public void regularBatch()
	{
		System.out.println("I am a Regular batch student.");
	}
}


public class DecideBatchNameUsingThreadName 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);	
		try(sc)	// Try with resource will automatically close the scanner object
		{
			System.out.print("Enter your Batch Title : ");
			String title = sc.next();
			//If user enter wrong input then try will create exception object
			//and throw to the nearest catch block
			
			BatchAssignment b = new BatchAssignment();
			b.setName(title);
			
			// start() will start the new thread
			b.start();	// From this line BatchAssignment will ask JVM to get new stack memory
		}
		catch(InputMismatchException e)	// here catch will catch the exception object
		{
			 // This massage will print instead of exception 
			//	And program will go to the remaining tasks smoothly
			System.out.println("Invalid Input");
		}
		
		
	}

}