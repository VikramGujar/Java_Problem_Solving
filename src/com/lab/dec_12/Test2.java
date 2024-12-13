package com.lab.dec_12;

class Test2
{
    @SuppressWarnings("deprecation")
	public static void main(String []args)
    {
        Thread t = Thread.currentThread();	// Current thread is main thread
		System.out.println(t);	// This will invoke toString method of Thread class
        System.out.println("Name of thread  : "+t.getName()); // here we will get name of main thread
		System.out.println("Id of thread  : "+t.getId());	// here we will get id of main thread
		//getId() is deprecated method from java 19 

    } 
}

/*
Thread[#1,main,5,main]	[default , Thread name , Priority , GroupName]
Name of thread  : main
Id of thread  : 1
*/