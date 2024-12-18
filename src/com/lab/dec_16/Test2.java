package com.lab.dec_16;

class Test extends Thread
{
	@Override
	public void run() {
		System.out.println("Run");
		super.run();
	}
	
	@Override
	public synchronized void start() {
		System.out.println("Start");
		super.start();	// call to start method of Thread class
	}	
}
public class Test2
{
	public static void main(String[] args) {
		nit();	
	}
	
	static public void nit() {
		Test test = new Test();
		test.start();	// call to start method of Test class
	}
}

// start
// run