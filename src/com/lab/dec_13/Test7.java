package com.lab.dec_13;

class MyThread extends Thread
{
	public void run()	// Never get Called
	{
		System.out.println("MyThread: run()");
	}

	@Override 
	public void start()	// Override from Thread class
	{
		System.out.println("MyThread: start()");
	}
}

class MyRunnable implements Runnable
{
	public void run()
	{
		System.out.println("MyRunnable: run()");
	}

	public void start()	// Never get call
	{
		System.out.println("MyRunnable: start()");
	}
}

public class Test7 
{
	public static void main(String args[])
	{
		MyThread myThread  =  new MyThread();	// Create object of MyThread
		MyRunnable myRunnable = new MyRunnable();	// Create Object for myRunnable
		Thread thread  =  new Thread(myRunnable);	// Create Thread object with target myRunnable
		myThread.start();	// Call the start method of myThread class
		thread.start();		// Start Thread in myRunnable class
	}
}

