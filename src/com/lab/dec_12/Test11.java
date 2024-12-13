package com.lab.dec_12;

class MyThreadA extends Thread
{
	String s;
	public void run(String s) 	// This is not a run() method of Thread class
	// This method is not overridden method you need to call it explicitly
	{ 
		this.s=s;
		for (;;) 
		{
			System.out.println("s will be printed :"+s);
		}
	}
}
class MyThreadB extends Thread 
{
	String t;
	public void run(String t) // This is not a run() method of Thread class
	// This method is not overridden method you need to call it explicitly
	{ 
		this.t=t;
		for (;;) 
		{
			System.out.println("t will be printed :"+t);
		}
	}
}
public class Test11
{
public static void main(String [] args) 
{
  MyThreadA t1 = new MyThreadA();
  MyThreadB t2 = new MyThreadB();
		t1.start();
		t2.start();
		
	}
}


// No output because you are not calling the run(String s/t)
