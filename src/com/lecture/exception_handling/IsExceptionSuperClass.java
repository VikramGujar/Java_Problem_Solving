//WAP in java that describes Exception is the super class 
//of all the exceptions (Checked + unchecked) in java.

package com.lecture.exception_handling;

public class IsExceptionSuperClass {

	public static void main(String[] args) 
	{	  
	   Exception e1 = new ArithmeticException("Error Message");
	   System.out.println(e1);
	   
	   Exception e2 = new InterruptedException("Thread is Interrupted");
	   System.out.println(e2);
	  
	}
}
