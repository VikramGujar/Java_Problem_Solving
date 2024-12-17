package com.lab.dec_13;

class MyThread9 implements Runnable
{
	String str;
	MyThread9(String str)
	{
		this.str=str;
	}
	public void run()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println(str+ " : "+i);
			try
			{
				Thread.sleep(100);	// Current thread will go to waiting state
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
public class Test9
{
	public static void main(String [] args)
	{
		// Create object and call constructor
	MyThread9 obj1 = new MyThread9("Cut the Ticket");
	MyThread9 obj2 = new MyThread9(" Show the Seat");

		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);

		// Start new threads
		t1.start();	 
		t2.start();	

	}
}
// Because of sleep(100)
// Output will one by one [11 22 33 ...]
