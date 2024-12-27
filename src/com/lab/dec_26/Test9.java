package com.lab.dec_26;

class TickTock 
{
	int count;
	public synchronized void increment()
	{
		count++;
	}
}

public class Test9 
{
	public static void main(String[] args) throws Exception
	{
		TickTock tt = new TickTock();
		Thread t1 = new Thread(new Runnable() 
		{
			public void run()
			{
				for (int i = 0; i < 100000; i++) {
					tt.increment();
				}
			}
		});
		Thread t2 = new Thread(new Runnable() 
		{
			public void run()
			{
				for (int i = 0; i < 100000; i++) {
					tt.increment();
				}
			}
		});
                t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("Count : " + tt.count);
	}
}
