package com.lab.dec_13;

class Test6
{
	public static void main(String[] args) 
	{
		//  method on Runnable interface
		Runnable r = new Runnable() {
			public void run() {
				System.out.print("Cat");
			}
		};
		// will initialize Target by Thread(Runnable target) constructor 
		Thread t = new Thread(r) {
			public void run() {
				System.out.print("Dog");
			}
		};
		/**
		 * Here new thread will start 
		 * but JVM executes from bottom to top thats why 
		 * Cat is Override by Dog 
		 * It  will print Dog 
		 */
		t.start();	
		
		
	}
}	
