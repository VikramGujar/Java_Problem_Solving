package com.lab.dec_02;

interface NIT13
{
	void myInterface(int a);
	default void defalutFunction() // We can write Default method in functional interface
	{
		System.out.println("Naresh I Technologies"); // Default method can contain body in interface
	}
	
}
public class Java8_13 {
	public static void main(String[] args) {
		NIT13 nit = (int a) -> System.out.println(a/5);	// Lambada expression [15/5 = 3]
		nit.myInterface(15);	// Output : 3
	}
}
