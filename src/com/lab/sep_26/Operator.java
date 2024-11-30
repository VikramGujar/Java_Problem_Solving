package com.lab.sep_26;

public class Operator {

	 public static void main(String[] args) 
	  {
			int a=20, b=10;
			if((a>b)&&(--b <12)) 	// --b [Pre-decrement]
			{
				System.out.println(b);  // b = 9
			}
			System.out.println(a);	// a = 20
	   }
}
