package com.lab.dec_02;

interface NIT8
{
	public int myInterface(int a);
}
public class Java8_8 {
	public static void main(String[] args) {
		NIT8 nit = (int a) -> a*5;	
		int i = nit.myInterface(6);	// Calculate in lambada expression [ 6 * 5 = 30 ]
		System.out.println(i);	// Output : 30
	}
}