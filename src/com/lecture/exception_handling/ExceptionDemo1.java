package com.lecture.exception_handling;

import java.util.Scanner;

public class ExceptionDemo1 {

	public static void main(String[] args)  
	{		
		   System.out.println("Main method started....");	
		   Scanner sc = new Scanner(System.in);
		   
		   try
		   {
			   System.out.print("Enter the value of x :");
			   int x = sc.nextInt();	// taking input from user
			   
			   System.out.print("Enter the value of y :");
			   int y = sc.nextInt();	// if number is 0 then exception will occur 
			   
			   int result = x/y;	// number can not be divisible by 0 [ Exception will occur ]
			   // After exception Try block will create 
			   // below lines will not execute 
			   // Try 
			   System.out.println("Result is :"+result);
			   System.out.println("End of try block");
			   
		   }
		   catch(Exception e)
		   {
			  System.out.println("Inside Catch Block");
			  System.err.println(e); 
		   }
		   System.out.println("Main method ended....");
		   sc.close();
	}
}
