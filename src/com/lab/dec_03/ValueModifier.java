package com.lab.dec_03;

import java.util.function.Consumer;

public class ValueModifier {

	public static void main(String[] args) {
		
		
		Consumer<String> stringConsumer = str -> 
		System.out.println("The length of String is : "+str.length());
		
		Consumer<Integer> integerConsumer = num -> 
		System.out.println("Square of given number is : "+(num*num));
		
		String str = "Hello"; int num =3;
		stringConsumer.accept(str);
		integerConsumer.accept(num);
		
		
	}

}
