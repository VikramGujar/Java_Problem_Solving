package com.lecture.exception_handling;

import java.util.Scanner;

public class AbnormalTerminationDemo {

	public static void main(String[] args) 
	{
		System.out.println("Main method Started!!!");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the value of x :");
		int x = sc.nextInt();
		
		System.out.print("Enter the value of y :");
		int y = sc.nextInt();
		//if you pass any number by 0
		int result = x/y;	//  then Exception will come and program terminate at line 18
		System.out.println("Result is :"+result);
		
		System.out.println("Main method Completed!!!");
		sc.close();	
	
	}
}

	/*
	*	In the above program, 
	*	If we put the value of y as 0 then program will be terminated in the middle, 
	*	IT IS CALLED ABNORMAL TERMINATION.
	*	Actually JVM has a default exception handler 
	*	which is responsible to handle the exception 
	*	and terminate the program in the middle abnormally.
	*/



