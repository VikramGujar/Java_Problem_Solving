package com.lab.dec_02;

interface NIT7
{
	public int myInterface(int a);
	// functional interface having only one abstract method 
}

public class Java8_7 {
	public static void main(String[] args) {
		NIT7 nit = (a) -> a+1;	// lambada expression allow in Functional interface
		int i = nit.myInterface(6);	// Calculation done in lambada expression
		System.out.println(i);	// Output : 7
	}
}
