package com.vikram.basic;

public class Literals {

//	It is a constant value which we are assigning to a variable.
//
//	In java we have 5 types of Literals :
//
//	 1) Integral Literal
//	 2) Floating point Literal
//	 3) Boolean Literal
//	 4) Character Literal
//	 5) String Literal
//	 
//	Note : null is also literal which we assign to reference variable.
	
	
//		Integral Literal :
//		------------------
//		If any numberic literal does not contain decimal or 
//		fraction then it is called Integral literal.
//		Example :  12, 89, 56 and so on
//
//		In integral literal we have 4 data types :
//		  a) byte (8 bits)
//		  b) short (16 bits)
//		  c) int (32 bits)
//		  d) long (64 bits)
	
	
//		An integral literal we can represent in 4 different forms :
//		   a) Decimal Literal (Base 10)
//		   b) Octal Literal (Base 8)
//		   c) Hexadecimal Literal (Base 16)
//		   d) Binary Literal (Base 2)
	
	
//		Decimal Literal :
//		-----------------
//		By default our integral literal in Decimal Literal only. 
//		Here Base is 10 hence it accepts 10 digits i.e 0 to 9.
//
//		Example : int x = 20;
//		          int y = 50;
//			  	  int z = 100;
	
	
//		Octal Literal :
//		---------------
//		If any integral literal starts with 0 (zero) then it will become 
//		octal literal. Here Base/Radix is 8 so, It will accept 8 digits i.e.
//		0 to 7.
//
//		Example : int x = 0777; //Valid
//		          int y = 015; //Valid
//			      int z = 018; //Invalid [Here digit 8 is out of range]
	
	
	
//		Hexadecimal Literal :
//		----------------------
//		If any integral literal starts with 0X (zero capital X) OR 
//		0x (Zero small x) then it will become hexadecimal Literal. 
//		Here Base is 16 so it will accept 16 digits i.e 0 to 9 and a to f.
//
//		Example :  int x = 0X15; //Valid
//		           int y = 0xadd; //Valid
//			   	   int z = 0Xface; //Valid
//			       int a = 0xage; //Invalid [Here g is out of the range]
	
	

//		Binary Literal :
//		----------------
//		It is available from Java 7 version. 
//		If any integral literal starts with 0B (zero capital B) OR 
//	    0b (zero small b) then it will become Binary Literal. 
//		Here base is 2 so, It will accept only 2 digits i.e 0 and 1.
//
//		Example : int x = 0B101; //Valid
//          	  int y = 0b111; //Valid
//	  			  int z = 0B112; //Invalid
	
	
//		As a programmer we can represent an integral literal in four different forms
//		like decimal, octal, hexadecimal and binary but 
//		to get the output JVM will always convert these numbers in decimal format only.
	
	
//	By default every integral literal is of type int only. 
//	byte and short are below than int so we can assign integral literal
//	(Which is by default int type) to byte and short
//	but the values must be within the range. 
//	[for Byte -128 to 127 and for short -32768 to 32767]
	
	
//	Actually whenever we are assigning integral literal to byte and 
//	short data type then compiler internally converts into corresponding type.
//
//	byte b = (byte) 12; [Compiler is converting int to byte]
//	short s = (short) 12; [Compiler is converting int to short]
	
//	In order to represent long value we should use either L OR l (Capital L OR Small l)
//	as a suffix to integral literal.
//	According to IT industry, we should use L bacause l looks like digit 1.
	
	
	
	/* 
	By default every integral literal is of type int only
	public class Test
	{
	public static void main(String[] args)
		{
	        byte b = 128;
			System.out.println(b); //error
			
			short s = 32768;
			System.out.println(s); //error
	    }
	}

	Here byte and short both the values are out of the range so compilation error.	
	*/
	
	
	
	/*
	 Assigning smaller data type value to bigger data type
	  
	public class Test
	{
		public static void main(String[] args)
		{
   	    	byte b = 125;  
			short s = b;  //[Implicit OR Automatic OR Widening]
			System.out.println(s);
		}
	}
	*/
	
	
	/*
	Converting bigger type to smaller type
	public class Test
	{
	public static void main(String[] args)
		{
			short s = 127; 
			byte b = (byte)s;  //[Explicit OR Manual OR Widening]
			System.out.println(b);
		}
	}

	Note : User is responsible to provide Explicit type casting 
		   (In case user is trying to assign bigger to smaller type)
		   but here there is chance of loss of data.
   */
}
