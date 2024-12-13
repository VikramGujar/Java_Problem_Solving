package com.lab.dec_12;

class Test9 
{
	public static void main(String[] args) 
	{
		try
		{
			Horse1 h = new Horse1();
			Thread t1= new Thread(h,"MyHorse");
			Thread t2= new Thread(h,"YourHorse");
			// Calling Thread(Runnable target, String name)
			
			new Test9().go(t2);
			// Calling of go(Thread t) 
			
			t1.start(); t2.start();
			// calling t1 and t2 threads
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
		// go accepting parameter of thread class object [ t2 ]
		void go(Thread t)
		{
			t.start();
			// t2 is starting two times thats why Exception generate
		}
	
	
}
class Horse1 implements Runnable
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" ");
		// Will print MyHourse and YourHorse
	}
}