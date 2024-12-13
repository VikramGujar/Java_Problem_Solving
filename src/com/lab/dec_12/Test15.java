package com.lab.dec_12;

public class Test15
{
	   public static void main(String []argv)
	   {
	      Thread t = Thread.currentThread();
	      System.out.println("Name of current thead : "+t.getName());	// Name of current thread : main
	      t.setName("First Thread");	// set name of main to First Thread
	      System.out.println("Name of thread after change : "+t.getName());	// Name of current thread : First Thread
	   } 
	}
