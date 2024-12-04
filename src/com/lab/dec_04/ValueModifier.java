package com.lab.dec_04;

import java.util.function.Consumer;


public class ValueModifier {

	public static void main(String[] args) {
		
		int n = 5;
		
		Consumer<Integer> doubleValue = num -> 
		System.out.println("After doubling the value : "+num*2);
		
		Consumer<Integer> incrementBy = num -> 
		System.out.println("After incrementing the value by 3 : "+(num+3));
		
		Consumer<Integer> squareValue = num -> 
		System.out.println("After squaring the value: "+(num*num));
		
		System.out.println("Original value : "+n);
		modifyValue(n, doubleValue);
		modifyValue(n, incrementBy);
		modifyValue(n, squareValue);
		


	}

	public static void modifyValue(int num, Consumer<Integer> c)
	{
		c.accept(num);
	}
}
