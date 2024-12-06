package com.lab.dec_06;

public class AreaCalculator {

	public static void main(String[] args) {
		double lenght = 3.5, breath = -4.9;
		
		System.out.println("Area : "+calculateArea(lenght,breath));

	}
	
	public static double calculateArea(double l , double w){
		try {
			if(l<0 || w<0) {
				throw new IllegalArgumentException();
			}else {
				return l*w;
			}
		}catch (Exception e) {
			System.err.println("You are providing invalid value");
			return 0.0;
		}
	}

}
