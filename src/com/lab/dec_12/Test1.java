package com.lab.dec_12;

class Test extends Thread
{
	public void run()
	{
		for(int i=0; i<=10; i++)
		{
			System.out.println("Hello Welcome here.."+i);
		}
	}
}
class Test1 
{
	public static void main(String[] args) 
	{
		Test t = new Test();
		t.start();
		t.start();	// You can not restart a thread
		
	}
}

// In the above program we are trying to restart the thread it will generate an exception
// Line 19 will generate exception that is java.lang.IllegalThreadStateException