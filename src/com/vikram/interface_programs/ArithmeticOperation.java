package com.vikram.interface_programs;

public class ArithmeticOperation implements Calculator{

	@Override
	public void sum(int x, int y) {
		System.out.println("Addition is : "+(x+y));
		
	}

	@Override
	public void sub(int x, int y) {
		System.out.println("Subtraction is : "+(x-y));
		
	}

	@Override
	public void mul(int x, int y) {
		System.out.println("Multiplication is : "+(x*y));
		
	}

	@Override
	public void div(int x, int y) {
		System.out.println("Division is : "+(x/y));
		
	}

}
