package com.lab.dec_12;

class Test14
{
	public static void main(String[] args) 
	{
		Runnable r1 = new Runnable() // Anonymous inner class on reference r1 of Runnable
		{
			public void run() 
			{
				try 
				{
					while (true) // loop will always true
					{
						System.out.println("Hello, world!");
						Thread.sleep(1000);
					}
				} 
				catch (InterruptedException iex) {}
			}
		};

		Runnable r2 = new Runnable() // Anonymous inner class on reference r2 of Runnable
		{
			public void run() 
			{
				try
				{
					while (true) // loop will always true
					{
						System.out.println("Goodbye, " +" Beautiful world!");
						Thread.sleep(2000);
					}
				} 
				catch (InterruptedException iex) {}
			}
		};

		Thread thr1 = new Thread(r1);	// calling Thread class constructor 
		Thread thr2 = new Thread(r2);	// calling Thread class constructor 
		thr1.start();	// Starting a new thread 
		thr2.start();	// Starting a new thread 
	}
}


// This program will print 
// Hello world !!	[ After every 1 second ]
// Goodbye, Beautiful world !	[ After every 2 second ]
// Infinitely 



