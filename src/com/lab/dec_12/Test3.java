package com.lab.dec_12;

class Test3
{
public static void main(String args[])
{
	new Thread()	// Anonymous Inner class	{We are using thread class reference}
	{
		public void run()
		{
			System.out.println("task one");
		}
	}.start();	// Here start method will start a new thread from above anonymous inner class

	new Thread()
	{
		public void run()
		{
			System.out.println("task two");
		}
	}.start();	// start() method calls run() method of corresponding thread

}
}
