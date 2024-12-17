package com.lab.dec_13;

public class Test2 extends Thread 
{
	static String name = "Vikram";

	public static void main(String args[]) 
	{
		Test2 t = new Test2();
		t.Test(name);	// Call goes to Test (String name)
		System.out.print(" " + name);
	}

	public void Test(String name) {
		
		/**
		 * Test2 method is extending from Thread class
		 * start() method is available in Thread class
		 * That method will call run method but JVM execute from bottom to top
		 * JVM will execute run method of Test2 class
		 */
		start();
		System.out.print(" method");
	}

	/**
	 * Called by Thread class start() method internally 
	 */
	public void run() 
	{
		System.out.print(" run");
	}
}
	/*
	 * Output : method run Vikram
	 * 			 
	 */