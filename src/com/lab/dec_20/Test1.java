package com.lab.dec_20;


public class Test1 
{
	public static void main(String[] args) 
	{

		// New state
		new Thread(new Runnable() // anonymous inner class assign on runnable target
		{	
			@Override
			public void run() // Running state
			{
				System.out.println("Naresh I Technologies");
			}
		}).start();	// Runnable state
		System.out.println(new Thread().isAlive());
    }

}


