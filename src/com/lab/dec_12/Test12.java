package com.lab.dec_12;

public class Test12 extends Thread
{
public static void main(String argv[])
{
	Test12 b = new Test12();
	b.run();
	b.start();	// this line will call start method of current method
	// JVM always start execution form bottom to top 
	// JVM will check start method in child method [Test11] first 
	// Thats why start method of Thread class will never execute
} 
	public void start()	// this is a method of main Test12 class
	{
		for (int i = 0; i < 10; i++)
		{
			System.out.println("Value of i = " + i); 
		}  
	}
}
// Output will be Value of i = [0 to 9]
