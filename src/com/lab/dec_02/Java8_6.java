package com.lab.dec_02;

interface NIT6
{
	public int myInterface(int a); 
	public int myInterface(int a,int b);
	
	// this interface is having two abstract method 
}

public class Java8_6 {
	public static void main(String[] args) {
		//NIT6 nit = (a) -> a+1;	Error :"The target type of this expression must be a functional interface"
		//System.out.println(nit);
		// we can not use lambada expression outside functional interface 
	}
}
