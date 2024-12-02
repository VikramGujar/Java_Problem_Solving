package com.lab.dec_02;

interface NIT18
{
	int myInterface(int a, int b);
}
public class Java8_18 {
	public static void main(String[] args) {
		//NIT18 nit = (int a, int b) -> System.out.println(a+b);	// Can not return a void result
		//nit.myInterface(5, 10);
		System.out.println();
	}
}

// In the above example 
// myInterface method is having return type int
// but cursponding the lambada expression is returning a method println() 
// println method is returning void
// thats why Error [Can not return a void result] will come