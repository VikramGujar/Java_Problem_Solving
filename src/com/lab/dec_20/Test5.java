package com.lab.dec_20;

public class Test5 extends Thread {
	public static void main(String[] args) {
		if(Thread.currentThread().isDaemon()) 
		{
			System.out.println("Daemon thread Running");
		}
		else
			System.out.println("Normal Thread Running");
		
		Test5 java = new Test5();
		Test5 java1 = new Test5(); //setDaemon
		Test5 java2 = new Test5();
		Test5 java3 = new Test5();
		
		java1.setDaemon(true);
		
		java.start();
		java1.start();
		java2.start();
		java3.start();
		
    }
}