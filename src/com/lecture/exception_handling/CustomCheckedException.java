package com.lecture.exception_handling;


import java.util.Scanner;

@SuppressWarnings("serial")
class InvalidAgeException extends Exception
{
	public InvalidAgeException()
	{		
	}
	
	public InvalidAgeException(String errorMessage)
	{
		super(errorMessage);
	}
}

public class CustomCheckedException 
{
	public static void main(String[] args) 
	{
		
	  try
	  {
			validateAge();	
	  }
	  catch(InvalidAgeException e)
	  {
		  System.out.println(e);
	  }
		
	}
	
	public static void validateAge() throws InvalidAgeException
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Age :");
		int age = sc.nextInt();
		
		if(age<18)
		{
			throw new InvalidAgeException("Age is Invalid");
		}
		else
		{
			System.out.println("You are eligible for Voting");
		}
	}	
	

}
