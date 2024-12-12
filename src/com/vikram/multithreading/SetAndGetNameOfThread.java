package com.vikram.multithreading;

public class SetAndGetNameOfThread {

	public static void main(String[] args) {
		
		
		Thread th =  Thread.currentThread();
		
		//getName() will give you name of current thread
		String threadName = th.getName();
		System.out.println("The current running thread is : "+threadName);
		
		//setName() you can use to set the name of current thread
		th.setName("ParentThread");
		System.out.println("Updated name of thread is : "+th.getName());
		

	}

}
