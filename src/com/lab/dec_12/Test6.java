package com.lab.dec_12;

class Prime extends Thread	// Extends thread class to create threads by start() 
{
	public void run()	// run() To execute thread Task
	{
		try	// sleep() can throw interrupted exception
		{
			for(int i=1;i<=10;i++)
			{
				if(i==2||i==3||i==5||i==7)
				{
					System.out.println ("Prime No.= "+i);
				}
				Thread.sleep(500);	// Thread will sleep for half second 
			}
		}
		catch (Exception e){}
	}
}
class NotPrime extends Thread	// run() To execute thread Task
{
	public void run()
	{
		try	// sleep() can throw interrupted exception
		{
			for(int i=1;i<=10;i++)
			{
				if(i==4||i==6||i==8||i==9||i==10)
				{
					System.out.println ("Non-Prime No.= "+i);
				}
				Thread.sleep(500);	// Thread will sleep for half second 
			}
		}
		catch (Exception e){}
	}
}
class Test6
{
	public static void main(String args[])
	{
		new Prime().start();	// Here Prime class thread will get start 
		new NotPrime().start();	// Here NotPrime class thread will get start 
	}
}	