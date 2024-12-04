package com.lab.sep_26;

public class Operator5
{
	static int operate(int a,int b) // Accepting int parametr
	{
	    return (a * b);	// 11 * 23 = 153
	}
	static float operate(float a,float b) // Accepting float parameter
	{
	    return (a / b);	// 9.00/4.00 = 2.25
	}
	public static void main(String[] args) {
		
		int x = 11, y = 23;
	    float n = 9, m = 4;
	    System.out.print(operate(x, y)+"\t");	// operate(11,23) [\t is used to give TAB]
	    System.out.println(operate(n, m));		// operate(9,4)
	}
}