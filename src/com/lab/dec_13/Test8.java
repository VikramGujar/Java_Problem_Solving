package com.lab.dec_13;

class MyThread8 extends Thread
{
	String myName;

	MyThread8(String name)
	{
		myName = name;
	}

	public void run()
	{
		for(int i=0; i<10;i++)
		{
			System.out.println(myName);
		}
	}
}
public class Test8
{
	public static void main(String args[])
	{
		try
		{
			// setting names of thread
			MyThread8 mt1 = new MyThread8("mt1");
			MyThread8 mt2 = new MyThread8("mt2");
			mt1.start();	// mt1 will start
			mt1.join();		// main will wait mt1 to complete 
			mt2.start();	// mt2 will start after mt1
		}
		catch(InterruptedException ex)
		{
		}
	}
}

/*
 * mt1 10 times
 * mt2 10 times
 * */
