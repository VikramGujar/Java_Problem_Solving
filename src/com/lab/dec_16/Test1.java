package com.lab.dec_16;

public class Test1 implements Runnable
{
	public static void main(String[] args) throws InterruptedException 
	{
		Thread thread = new Thread(new Test1());
		thread.start(); // call run method will take time to create new stack
		System.out.print("nit ");//1
		thread.join();
		System.out.println("google ");//3
	}
	@Override
	public void run() {
		System.out.println("NareshIT");//2
	}
}
// nit NareshIT 
// google