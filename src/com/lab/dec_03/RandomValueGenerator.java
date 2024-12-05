package com.lab.dec_03;

import java.util.Random;
import java.util.function.Supplier;

public class RandomValueGenerator {

	public static void main(String[] args) {
		
		
		Supplier<String> stringSupplier = () -> {
			Random rd = new Random();
			int num = rd.nextInt(99, 1000);
			return "NIT"+num;
		};
		
		System.out.println(stringSupplier.get());
		
		
		
	}

}
