package com.lab.dec_12;

class Test4
{
	public static void main(String args[])
	{
		Runnable r1=new Runnable()	// Anonymous inner class referring to Runnable class object
		{
			public void run()
			{
				System.out.println("task one");
			}
		};

		Runnable r2=new Runnable()	// Anonymous inner class referring to Runnable class object
		{
			public void run()
			{
				System.out.println("task two");
			}
		};

		Thread t1=new Thread(r1);	
		Thread t2=new Thread(r2);
		// Here we are calling to the thread class constructor which is accepting the reference 
		// of the Runnable interface
		// i.e Thread( Runnable Target)
		

		t1.start();
		t2.start();
		// This start method will call start() inside thread which is internally 
		// calling run method on the passed object as a target in the constructor of thread class
	}
}
