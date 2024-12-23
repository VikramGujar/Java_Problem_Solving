package com.lab.dec_20;

class NIT extends Thread
{
	@Override
	public void run() {
		
		System.out.println("1st Thread");
	}
}

class NIT1 extends Thread
{
	@Override
	public void run() {
		
		System.out.println("2nd Thread");
	}
}

public class Test2 {
	public static void main(String[] args) 
	{
		NIT thread = new NIT();	// object for NIT
		NIT1 thread1 = new NIT1();	// object for NIT1
		
		thread.start();	// NIT one goes to Runnable state
		System.out.println(thread.getPriority());	// Default priority 5
		System.out.println(thread.isAlive());		// NIT [ true ]
		System.out.println(thread1.isAlive());		// NIT1[ false ]
		thread1.start();	// NIT1 goes to Runnable state
		thread1.setPriority(8);
		System.out.println(thread1.getPriority());	// Default priority 5
		
    }
}

/*
 public class Thread
 {
 	private int priority = 5;
 	
 	public final void setPriority(int priority)
 	{
 		this.priority = priority;
 	}
 	
 	public final int getPriority()
 	{
 		return this.priority;
 	}
 }
 */
