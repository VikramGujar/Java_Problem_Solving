package com.lab.dec_26;

public class Test2 
{
	   public static void main(String args[])
	     {
	       Runnable r1=new Runnable()
	        {
	          public void run()
	           {
	             System.out.println("How about your NewPlatForm?");
	           }
	        };

	       Runnable r2=new Runnable()
	          {
	             public void run()
	               {
	                  System.out.println("Are you Enjoying NewPlatform?");
	               }
	           };
	           Thread t1=new Thread(r1);
	           Thread t2=new Thread(r2);

	          t1.start();
	          t2.start();
	      }
	}
/*
 * Output 
 * How about your NewPlatForm?
 * Are you Enjoying NewPlatform?
 */

