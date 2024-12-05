package com.lab.dec_03;

import java.util.function.Function;

public class FunctionApplier {

	public static void main(String[] args) {
		
		Function<String, Integer> getStringLength = (str)-> str.length();
		
		Function<Integer, Double> divideAndFormat = (num)-> num/2.0;
			
		String str = "Vikram"; int num = 18;
		System.out.println("Length of string is : "+getStringLength.apply(str));
		System.out.println("After dividing by 2.0 number is : "+divideAndFormat.apply(num));
		
	}

}
