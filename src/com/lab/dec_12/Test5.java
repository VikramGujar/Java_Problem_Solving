package com.lab.dec_12;

class SimpleThread extends Thread // This class is extending from Thread class to create threads
{
   public SimpleThread(String str) 
	{
	   super(str);	// This super will call the constructor of the Thread class
	   // Thread class constructor assign value to name of thread 
    }
    	public void run() 
    	{
    		for (int i = 0; i < 10; i++) 
    		{
    			System.out.println(i + " " + getName());	// Here you will get the name of the thread that you passed in constructor
    			try 
    			{
    				sleep((int)(Math.random() * 1000));
    			}
    			catch (InterruptedException e) {}	
    			// If any other thread or self thread interrupt the execution then you 
    			// Will get InterruptedException
    		}
    		System.out.println("DONE! " + getName());	//// Here you will get the name of the thread that you passed in constructor
    	}
}


class Test5
{
	public static void main (String args[]) 
    	{
        	new SimpleThread("J2EE").start();	
        	new SimpleThread("J2ME").start();
        	// This lines will invoke the constructor of the SimpleThread class 
        	// With the string parameter str 
    	}
}
/*
 * You can not guess the output of the above program
 * Because In multithreading processor is switching between threads 
 * each time you will get output randomly
 * */

