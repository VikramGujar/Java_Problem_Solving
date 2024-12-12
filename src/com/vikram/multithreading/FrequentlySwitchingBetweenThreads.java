package com.vikram.multithreading;

class ChildThread extends Thread{
	
	@Override 
	public void run() {
		for(int i=0; i<=10; i++) {
			
			System.err.println(i+" by "+Thread.currentThread().getName()+" thread");
		}
	}
}
public class FrequentlySwitchingBetweenThreads {

	public static void main(String[] args) {
		System.out.println("Main Thread started\n");
		
		ChildThread cth = new ChildThread();
		cth.setName("ChildThread");
		cth.start();
		
		for(int i=0; i<=10; i++) {
			System.out.println(i+" by "+Thread.currentThread().getName()+" thread");
		}
		
		//Here processor is frequently switching from main thread to ChildThread 
		// so output is un-predicatable
		
		int i =0;
		do {
			System.out.println("Enjoy multithreading by Main");
			i++;
		}while(i<=5);

	}

}

// You can not guess the output of this program
// Because in Multithreading  CPU is switching between multiple threads Simultaneously
// you can not guess at which time CPU will be at which thread.
