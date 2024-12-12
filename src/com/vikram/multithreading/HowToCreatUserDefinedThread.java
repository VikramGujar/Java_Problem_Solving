package com.vikram.multithreading;

class userThread extends Thread{
	
	@Override
	public void run() {
		System.out.println("User thread is running");
	}
}

public class HowToCreatUserDefinedThread {

	public static void main(String[] args) {
		
		System.out.println("Main thread is Started");
		
		userThread ut = new userThread();
		
		ut.start();	// Main will not wait for userThread 
		
		System.out.println("Main thread Ended");	// this will print before userThread

	}

}
