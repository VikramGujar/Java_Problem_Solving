package com.lab.dec_02;

interface NIT11
{
	void myInterface(int a);
	
}
public class Java8_11 {
	public static void main(String[] args) {
		NIT11 nit = (int a) -> System.out.println(a+5);	// Lambada expression [ 15 + 5 = 20]
		nit.myInterface(15);	// Call to lambada expression prints [ Output : 20 ]
	}
}