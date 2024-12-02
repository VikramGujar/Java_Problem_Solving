package com.lab.dec_02;

interface NIT4
{
	public void myInterface(int a);
}

public class Java8_4 {

	public static void main(String[] args) {
		
		// NIT4 nit = (a) -> a+1;	 Void method can not return a value
		// System.out.println(nit);
	}

}

/*  In the above example 
	interface NIT is a functional interface 
	we can use lambada expression but 
	myInterface method is having return type void thats why 
	it can not return a value 
	lambda expression is returning a value [ a+1 ] 
	Error will come " void method can not return a value "
*/ 