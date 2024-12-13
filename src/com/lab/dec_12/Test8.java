package com.lab.dec_12;


class Test8
{
	public static void main(String[] args) 
	{		
		try
		{
			Horse h = new Horse();
			Thread t1= new Thread(h,"MyHorse");
			Thread t2= new Thread(h,"YourHorse");
			// Calling the parameterized constructor of Thread class
			// i.e Thread( Runnable target, String name)
			//new Test8().go(t2);
			// You are calling the method that is available inside the method
			// It will not invoke
			t1.start(); t2.start();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		// Compilation error 
		// Method inside a method
		//void go(Thread t)
		//{
		//	t.start();
		//}		
	}
	
}
class Horse implements Runnable
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" ");
	}
}
