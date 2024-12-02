package com.lab.dec_02;

public class Java8_23 {
	interface NIT23
	{
		int myInterface(int a, int b); 
	}
	
	public static void main(String[] args) {
		NIT23 nit = (int a, int b) -> a/b;	// 15 / 110 = 0
		int a = nit.myInterface(15, 110);
		System.out.println(a);	// 0
	}
}
