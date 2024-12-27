package com.lab.dec_26;

class NewPlatForm6 implements Runnable 
{
    public void run() 
    { 
    	System.out.printf("%d", 3); 
    }
}
    
public class Test7 
{
	    public static void main(String[] args) throws InterruptedException
	    {
	        Thread thread = new Thread(new NewPlatForm6());
	        thread.start();
	        System.out.printf("%d", 1);
	        thread.join();
	        System.out.printf("%d", 2);
	    }
}


