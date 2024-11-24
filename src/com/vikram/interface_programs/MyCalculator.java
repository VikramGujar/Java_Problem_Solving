package com.vikram.interface_programs;

public class MyCalculator implements AdvancedArithmetic {

	@Override
	public int divisorSum(int num) {
		if(num<1) {
			System.err.println("Error: Input must be a positive integer.");
			return 0;
		}else {
			int sum = 0;
			for(int i=1; i<=num; i++) {
				if(num%i==0) {
					sum = sum + i;
				}
			}
			return sum;
		}
			
		
	}

}
