package com.lab.dec_20;

public class Test6 extends Thread {
	
	@Override
	public void run() {
		if(Thread.currentThread().isDaemon()) 
		{
			System.out.println("Daemon thread Running");
		}
		else
			System.out.println("Normal Thread Running");
	}
	
	public static void main(String[] args) {
		
		
		Test6 java = new Test6();
		Test6 java1 = new Test6(); //setDaemon
		Test6 java2 = new Test6();
		Test6 java3 = new Test6();
		
		java1.setDaemon(true);
		
		java.start();
		java1.start();
		java2.start();
		java3.start();
		
    }
}
