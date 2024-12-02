package com.lab.dec_02;

interface NIT28
{
	void myInterface(String a);
	// Return type of myInterface method is void 
}
public class Java8_28 {
	
	public static void main(String[] args) {
		
		//without parameter
		NIT28 nit = information -> System.out.println("Welcome to " + information);
		// Printing concatinated massage with the help of ['+'] concatination operator
		// Welcome to NIT
		nit.myInterface("NIT");
	}
}
// Output 
// Welcome to NIT
