package com.lab.dec_02;

interface NIT17
{
	void myInterface(int a, int b);
}
public class Java8_17 {
	public static void main(String[] args) {
		NIT17 nit = (int a, int b) -> System.out.println(a+b);	// 5 + 10 = 15
		nit.myInterface(5, 10);	// Call to lambada expression
		// Output : 15
	}
}
