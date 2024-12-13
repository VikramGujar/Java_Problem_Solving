package com.lab.dec_12;

class Foo implements Runnable
{
	public void run() 
	{
		for(int i=0;i<3;i++)
			System.out.println("Run by..."+Thread.currentThread().getName()+",i Is "+ i);
	}
	public void run(String name)
	{
		System.out.println("This is Second"+name);
	}
}
	public class Test17
	{
		@SuppressWarnings("static-access")
		public static void main(String args [])
		{
			// creating object of foo class
			Foo f = new Foo();
			
			// creating object for thread class and foo class 
			//object passed in parameter of constructor
			Thread t = new Thread(f);
			try 
			{
				System.out.println("Number Will be printt After 500 MiliSecond..");
				for(int j=0;j<5;j++)
				{
					System.out.println("This is j..."+j);
					// Main thread will sleep for 500 Millisecond 
					// Each  time in loop
					t.sleep(500);
				}
			}
			catch(InterruptedException e) 
			{
				System.out.println("InterruptedException.."+ e);
				e.printStackTrace();
			}
		}
}
	
// In the above program 	
// We are not calling Foo thread and also the method run of foo class
// which is taking string parameter that why both will not execute 
	
	
	