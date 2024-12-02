package com.lab.dec_02;

interface NIT19
{
	int myInterface(int a, int b);
}
public class Java8_19 {
	public static void main(String[] args) {
		NIT19 nit = (int a, int b) ->
		{
			return a+b;
		};
		// code will compile Successfully 
		// No output 
		
	}
}