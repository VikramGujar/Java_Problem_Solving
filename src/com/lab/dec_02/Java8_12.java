package com.lab.dec_02;

interface NIT12
{
	void myInterface(int a);
//	void defalutFunction()	Error : [Abstract method should not contain body ]
//	{
//		System.out.println("Naresh I Technologies");
//	}
	
}
public class Java8_12 {
	public static void main(String[] args) {
		NIT12 nit = (int a) -> System.out.println(a/5); // Lambada function only allow in funactiona interface
		nit.myInterface(15);
	}
}