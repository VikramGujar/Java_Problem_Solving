package com.lab.dec_13;

class MyData extends Thread
{
	private boolean request;
	private String  data;
	
	public void run()
	{
		storeMessage("Hello");	// call storeMessage(String data) 
		String str=retrieveMessage();	// call String retrieveMessage() 
		System.out.println(str);	// Print => Hello : false
	}
		public synchronized void storeMessage(String data) 
		{
			request = true;	// Initialize request as true
			this.data = data;	// Initialize data as 'Hello'
		}

		public synchronized String retrieveMessage() 
		{
			request = false;	// Update request as false
			return data+" : "+request;	// return 'Hello : false'
		}
 	}
	
	public class Test4
	{
		public static void main(String[] args) 
		{
			MyData md = new MyData();
			md.start();    // Start new thread in class MyData  			
	}
}
