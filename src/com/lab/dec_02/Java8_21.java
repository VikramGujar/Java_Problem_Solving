package com.lab.dec_02;

interface NIT21
{
	int myInterface(int a, int b);
}
public class Java8_21 {
	int calculate(int i, int j, NIT21 nit)
	{
		return nit.myInterface(i,j);
	}
	public static void main(String[] args) {
		NIT21 addition = (a,b) -> a+b;
		NIT21 multiplication = (a,b) -> a*b;
		NIT21 division = (a,b) -> a/b;
		Java8_21 java = new Java8_21();
		int result = java.calculate(15, 5, multiplication);
		System.out.println(result);
		// Output : 75
	}
}
