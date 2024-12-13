package com.lab.dec_12;

class Test16 extends Thread
{
	public void run()	
	{
		System.out.println("PRINT ME");
	}
		public static void main(String []str)
		{
			try
			{
				for(int i=0;i<9;i++)
				{
					System.out.println(i);	// Will print 0-9 
					Thread.sleep(500);	// thread will sleep 0.5 second on each iteration
				}
			}
			catch(InterruptedException e)
			{
				System.out.println("thread exception");
			}
			Thread t=new Thread();	//Thread object created 
			t.start();	// t1 is calling thread class start() method
			// no effect because another thread is also written in main thread
		}
}