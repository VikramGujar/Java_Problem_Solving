package com.lab.dec_13;

public class Test10
{
	public static void main(String[] args) 
	{
		new Test10().go(); // call to go()
	}
	public void go() 
	{
		Runnable r = new Runnable()
		{
			public void run() 
			{
				System.out.println("foo");
			}};
			Thread t = new Thread(r);
			t.start();	// Will call run internally
			t.run();	// Will call run directly
	}
 }

// Output :
// foo
// foo