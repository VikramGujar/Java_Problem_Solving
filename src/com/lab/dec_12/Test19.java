package com.lab.dec_12;


class MyThread extends Thread 
{
	public void run() // Start method will internally call this method
	{
		for (int i=0; i < 10; i++) 
		{
			System.out.println("hello world1");
		}
	}
}
	public class Test19
	{
		public static void main(String [] args) 
		{
			MyThread t1 = new MyThread();	// Creating object for MyThread class
			t1.start();	// MyThread started
			try //If exception occur in try it will throw exception object
			{
				t1.join(); // Main thread will until MyThread is completed 
			} 
			catch (InterruptedException e) // Catch will catch the exception object thrown by try
			{
				System.out.println("ERROR: Thread was interrupted");
			}       
			System.out.println("Thread is done!");	// After execution on MyThread main will get resume 
	}
}