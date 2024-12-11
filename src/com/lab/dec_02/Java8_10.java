package com.lab.dec_02;

interface NIT10
{
	void myInterface(int a);
	
}
public class Java8_10 {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		NIT10 nit = (int a) -> System.out.println(a+5);
		//No Output
		// We are not calling myInterface Method
	}
}