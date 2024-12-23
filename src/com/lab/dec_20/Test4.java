package com.lab.dec_20;

class NIT4 implements Runnable 
{
	@Override
	public void run() 
	{
		for(int a=0;a<10;a++)
		{
			System.err.println("NareshIT1 :"+a);
			try 
			{
				 Thread.sleep(2000);	// goes to waiting for 2 second on every cycle
			} catch (InterruptedException e) 
			{
				System.out.println("NIT Thread failed");
			}
		}
	}
}

class NIT41 implements Runnable
{
	@Override
	public void run() 
	{
		for(int a =0;a<10;a++) 
		{
			System.out.println("NareshIT2 :"+a);
			try 
			{
				Thread.sleep(500);	// goes to waiting for 0.5 second on every cycle
			} catch (InterruptedException e) 
			{
				System.out.println("NIT1 Thread failed");
			}
		}
		
	}
}

public class Test4 
{
	public static void main(String[] args) 
	{
		Runnable nit = new NIT4();
		Runnable nit1 = new NIT41();
		
		Thread thread = new Thread(nit);
		Thread thread1 = new Thread(nit1);
		
		thread.start();
		thread1.start();
    }
}

