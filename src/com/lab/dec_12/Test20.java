package com.lab.dec_12;

public class Test20 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Main thread started");	// main thread starts
		Thread thread = Thread.currentThread();	// Object for thread class
		String name = thread.getName();	// Name of the current thread  [Main]
		
		for(int i=1; i<=5; i++)
		{			
			System.out.println(i + " by "+name+ " thread ");
			Thread.sleep(1000);
			thread.join();	// Main thread is waiting for main thread to complete 
			// Dead lock situation method will wait infinitely
		}		
		System.out.println("Main thread ended");
	}

}

