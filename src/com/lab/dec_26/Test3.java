package com.lab.dec_26;

class Test31  extends Thread
	{
		public void run()
		{
			for(int i=0; i<=3; i++)
			{
				System.out.println("Hello Welcome here.."+i);
			}
		}
	}
	class Test3
	{
		public static void main(String[] args) 
		{
			Test31 t = new Test31();
			t.start();
	        @SuppressWarnings("unused")
			Test31 t2= new Test31();
			t.start();	// IlligalThreadStateException [ Thread can not be restart ]
		}
	}