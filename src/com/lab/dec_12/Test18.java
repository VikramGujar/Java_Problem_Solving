package com.lab.dec_12;

public class Test18 extends Thread
{
	@SuppressWarnings("deprecation")
	public static void main(String [] args)
	{
		System.out.println(Thread.currentThread().getId()+" "); // Deprecated Method getId()
		// This will print mainThread Id which is 1
		
		Thread t1 = new Thread(new Test18(),"Rahul");	// Thread named assign " Rahul "
		Thread t2 = new Thread(new Test18(),"Ravi");	// Thread named assign " Ravi "
		Thread t3 = new Thread(new Test18(),"Puja");	// Thread named assign " Pooja "
		
		t3.start();	// Pooja thread started
		t1.start();	// Rahul thread started
		t2.run();	// This call will go from main thread
		t2.start();	// Ravi thread started 
	}
	public  void run()
	{
		    for(int i=0; i<2; i++)
			System.out.println(Thread.currentThread().getName()+" I'm :"+i);
			System.out.println("It is end of loop for : "+Thread.currentThread().getName());
			// main, Rahul, Ravi and Pooja thread will print 
			// Each two times
	}
}