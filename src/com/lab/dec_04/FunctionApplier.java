package com.lab.dec_04;

import java.util.function.*;

public class FunctionApplier {

	public static void main(String[] args) {
		int num = 10;
		Function<Integer, Integer> add = (n1)-> n1+5;
		Function<Integer, Integer> multiply = (n1)-> n1*2;
		Function<Integer, Integer> subtract = (n1)-> n1-7;
		
		System.out.println("Original value: "+num);
		System.out.println("After adding 5: "+applyFunction(num, add));
		System.out.println("After multiplying by 2: "+applyFunction(num, multiply));
		System.out.println("After subtracting 3: "+applyFunction(num, subtract));
		
		
	}

	public static int applyFunction(int value,  Function<Integer, Integer> f) {
		return f.apply(value);
	}
}
