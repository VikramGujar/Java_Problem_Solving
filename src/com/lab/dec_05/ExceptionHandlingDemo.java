package com.lab.dec_05;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		handleExceptions(null);
	}
	
	public static void handleExceptions(String input) {
		
		try {
			
			System.out.println("The length of string is : "+input.length());
			System.out.println("Converted number :"+Integer.parseInt(input)); 
			input.describeConstable();
			
		} catch (Exception e) {
			if(e instanceof NumberFormatException)
			{
				System.err.println("Input a valid integer string");
				
			}
			else if(e instanceof NullPointerException) {
				System.err.println("Cannot invoke String.length() because nullCheck is null");
			}
		}
	}
	
}
