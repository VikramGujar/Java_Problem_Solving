package com.lab.dec_12;


class Parrot implements Runnable
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" ");
	}
}
public class Test10
{
	static Parrot p;	// p is an Instance variable of Parrot type 

	static { p=new Parrot();}	// p is assigned with parrot object

	// Below statement will call constructor of the 
	// thread class and set the name of thread as Peacock with the reference 
	// of Parrot class which implements runnable method 
	// and t1.start() will internally call run method on the parrot class reference 
	// this will start the thread ["Peacock"].
	{Thread t1= new Thread(p,"Peacock"); t1.start();}
	// Thread(Runnable target, String name)

	/*
	 * public static final start()
	 * {
	 * 		target.run();
	 * }
	 * */
	
	public static void main(String [] args)
	{
		new Test10();

		new Thread( new Runnable()	// anonymous inner class
		{
			public void run()
			{
				;
			}
		},"Koyal").start();

		new Thread(new Parrot(),"Parrot").start();
	}
	

	static{
	  Thread t2 = new Thread(p,"Sparrow");t2.start();
	  // This line 
	}

	}
