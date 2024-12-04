package com.lecture.exception_handling;

public class ExceptionHandlingNotes {
	/*
	 
	What is an execption ?
	----------------------
	An execption is a runtime error.

	An execption is an abnormal situation or un-expected situation in a normal execution flow.

	An exception encounter due to dependency, 
	if one part of the program is dependent to another part 
	then there might be a chance of getting Exception.
	
	AN EXCEPTION ALSO ENCOUNTER DUE TO WRONG INPUT GIVEN BY THE USER.
	
	
	
	Different Crieteria of Exception :
	----------------------------------
	
	The following are the different criteria for exception :

	1) java.lang.ClassCastException
   	If we assign super class object to sub class reference 
   	variable then at runtime we will java.lang.ClassCastException
   
    Dog d1 = (Dog) new Animal();
   
   
	2) java.lang.ArithmeticException
    If we divide a number by zero (int value) then at runtime we will get an exception 
    i.e java.lang.ArithmeticException
    
   	System.out.println(12/0);



	3) java.lang.ArrayIndexOutOfBoundsException
    If we try to access the index of an array which is not 
    available or value is not available then we will get
    java.lang.ArrayIndexOutOfBoundsException.

    int []arr = {10,20,30};
    System.out.println(arr[3]);


	4) java.lang.NegativeArraySizeException
    An array size must be positive integer, if we pass any 
    Negative value then we will get java.lang.NegativeArraySizeException
   
    int arr[] = new int[-5];
   

	5) java.lang.NullPointerException
    If we call any non static method on reference variable 
    which is pointing to null then we will get 
    java.lang.NullPointerException
   
    Case 1:
    -------
    String str = null;
    System.out.println(str.length());
   
    Case 2:
    -------
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your Name :");
    String name = sc.nextLine(); //"null"
		
    System.out.println(name.length());
   
   
 	6) java.lang.NumberFormatException :
 	------------------------------------
    If we try to convert any String value into primitive (int) 
    or Wrapper (Integer) type and if the number is not in a 
    proper format then we will get java.lang.NumberFormatException. 
   
    String str = "NIT";				
    Integer valueOf = Integer.valueOf(str);		
    int i = Integer.parseInt(str);
   
	
	
	7) java.util.InputMismatchException
	-----------------------------------
    At the time of reading the data from Scanner class,
    if we read the data not in a proper format then we will get an exception 
    java.util.InputMismatchException
   
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your Age :");
    int age = sc.nextInt(); //Eleven 		
    System.out.println("Your Age is :"+age);
   
	 
	 
	Exception Hierarchy :
	--------------------
	This Exception hierarchy is available in the diagram (Exception_Hierarchy.png)

	Note :- As a developer we are responsibe to handle the Exception. 
			System admin is responsibe to handle the error because we 
			cannot recover from error.

	 
	 Exception format :
	 ------------------
	 The java software people has provided the format of exception 
	 so whenever we print exception object then the format is 
	 Fully Qualified Name : errorMesage
	 Package Name + Class Name : errorMessage
	 
	 
	 
	 
	 
	 Key points to remember :
	 --------------------------------
	 
	-> With try block we can write either catch block or finally block or both.
	-> In between try and catch we can't write any kind of statement.
	-> try block will trace our program line by line.
	-> If we have any exception inside the try block,With the help of JVM, 
	   try block will automatically create the appropriate Exception object and 
	   then throw the Exception Object to the nearest catch block.
	-> In the try block whenever we get an exception the control will directly jump 
	   to the nearest catch block so the remaining code of try block will not be executed.
 	-> catch block is responsible to handle the exception.
 	-> catch block will only execute if there is an exception inside try block.
 	-------------------------------------------------------------------------------------
	
	
	
	try block :
	-----------
	Whenever our statement is error suspecting statement OR Risky statement 
	then we should write that statement inside the try block.

	try block must be followed either by catch block or finally block or both.

	*try block is responsible to trace our code line by line, 
	*if any execption encounter then with the help of JVM, 
	*TRY BLOCK WILL CREATE APPROPRIATE EXECPTION OBJECT, 
	*AND THROW THIS EXCEPTION OBJECT to the nearest catch block.

	After the execption in the try block, the remaining code of try block will not be executed 
	because control will directly transfer to the catch block.

	In between try and catch block we cannot write any kind of statement.





	catch block :
	--------------
	The main purpose of catch block to handle the exception 
	which is thrown by try block.
	catch block will only executed if there is an exception in the try block.
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 */

}
