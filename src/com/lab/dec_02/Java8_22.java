package com.lab.dec_02;

interface NIT22
{
	int myInterface(int a, int b);
}
public class Java8_22 {
	int calculate(int i, int j, NIT22 nit)
	{
		return nit.myInterface(i,j);
	}
	public static void main(String[] args) {
		int result = 0;
		NIT22 addition = (a,b) -> a+b;
		NIT22 multiplication = (a,b) -> a*b;
		NIT22 division = (a,b) -> a/b;
		Java8_22 java = new Java8_22();
		result = java.calculate(15, 5, multiplication);
		System.out.println(result);	// 75
		result = java.calculate(result, result, addition);
		System.out.println(result);	// 150
		result = java.calculate(result, result, division);
		System.out.println(result);	// 1
	}
}

// Output : 
//			75
//			150
//			1




