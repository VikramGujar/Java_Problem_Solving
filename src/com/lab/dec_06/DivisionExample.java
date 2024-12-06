package com.lab.dec_06;


public class DivisionExample {
	
	public static void main(String[] args) {
		int n1 = 10 , n2 = 2 ;
		
		performDivision(n1, n2);
	}
	public static int performDivision(int num1, int num2) {
		
		try {
			
			int div = num1 / num2;
			System.out.println("The division is :"+div);
			return 0;
			
		} catch (Exception e) {
			
			System.err.println("Can not divide number by zero");
			return 0;
		}
	}
	
	


}








