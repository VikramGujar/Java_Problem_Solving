package com.lab.dec_13;

class A implements Runnable 
{  
	public void run() 
	{
     System.out.print(Thread.currentThread().getName());
	}  
}  
	class B implements Runnable
	{  
		public void run() 
		{  
			/**
			 * new A().run will call run method of A class
			 * But under [ T1 ] thread
			 */
			new A().run();  
			
			/**
			 * Here also we are calling run method without start
			 * new Thread will not going to start
			 * Thread will run under [ T1 ]
			 */
			new Thread(new A(),"T2").run();  
			
			/**
			 * This line will start the thread named [T3]
			 * in class A
			 */
			new Thread(new A(),"T3").start();  
		}
	}  
	public class Test1
	{  
		public static void main (String[] args) 
		{  
			/**
			 * This line will start the new thread 
			 * And set its name as [T1]
			 * call will go to its run method through start method of Thread class
			 */
			new Thread(new B(),"T1").start();  
		}
	}

	/**
	 * Output :	T1T1T3
	 */
	
		