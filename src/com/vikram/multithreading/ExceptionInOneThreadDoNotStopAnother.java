package com.vikram.multithreading;

class IndependentThread extends Thread {
	
	@Override 
	public void run() {
		//This will execute because exception in one thread
		// can not interrupt the execution of other
		System.out.println("Independent thread is running");
	}
}

public class ExceptionInOneThreadDoNotStopAnother {

	public static void main(String[] args) {
		System.out.println("Main method started");
		
		IndependentThread it = new IndependentThread();
		
		it.start();	// IndepentThread will start
		
		System.out.println(10/0);	// Exception will occur
		
		System.out.println("Main method ended");	// will not execute 

	}

}
