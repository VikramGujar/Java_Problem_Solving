package com.lab.dec_12;

public class Test7 extends Thread
{
	static Thread t;	// Class level variable [Instance variable storing thread object ]
	public static void main(String [] args)
	{
		try
		{
			t=new Thread(new Test7(),"Vikram");	// This will call the constructor of the  
			t.start();	// Here new thread will start with name [ Vikram ]
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	public void run()	
	{
		for(int i=1; i<5; i++)
		{
			try
			{
				System.out.print(Thread.currentThread().getName()+"");	// This will print name of the thread which is Vikram
				t.start();	// This line will generate an exception 
				// We can not re-start the thread [Exception :  java.lang.IllegalThreadStateException ]
			}
			catch (Exception e)
			{
				System.out.println(" will not botther about but "+e+" happened "+i+" times");
			}
		}
	}
}