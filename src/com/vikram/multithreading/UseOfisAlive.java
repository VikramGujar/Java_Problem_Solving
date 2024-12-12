package com.vikram.multithreading;

class demoThread extends Thread{
	
	@Override 
	public void run() {
		System.out.println("Demo thread is running");
	}
}
public class UseOfisAlive {

	public static void main(String[] args) {
		System.out.println("Main method started");
		
		
		demoThread dt = new demoThread();
		
		//Before thread start
		System.out.println("Is demoThread alive : "+dt.isAlive()); // print false
		
		//Thread started
		dt.start();
		
		//After thread started
		System.out.println("Is demoThread alive : "+dt.isAlive()); // print true
		
		System.out.println("Main method ended");
		
		//Dead thread remains dead
		//dt.start();
		//You can not restart the thread
		//It will generate java.lang.IllegalThreadStateException
	}

}
