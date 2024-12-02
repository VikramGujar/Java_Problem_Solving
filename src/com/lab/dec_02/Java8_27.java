package com.lab.dec_02;

interface NIT
{
	String myInterface(String a);
	// Method return type is string
}
public class Java8_27 {
	
	public static void main(String[] args) {
		
		// without parameter
		// NIT nit = information -> System.out.println("Welcome to " + information);
		// Error : "Cannot return a void result"
		// Method is having string as return type 
		// But println method returns void 
		// nit.myInterface("NIT");
	}
}