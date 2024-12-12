package com.vikram.multithreading;

public class MainThread {

	public static void main(String[] args) {
		
		Thread th = Thread.currentThread();
		System.out.println("Parent thread is : "+th.getName());
		
						//OR
		
		String threadName = th.getName();
		System.out.println("The current thread is : "+threadName);
		
		

	}

}
