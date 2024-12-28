package com.lab.dec_28;

import java.util.*;
public class BMICalculatorMain {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Lets Calculate your BMI");
		
		System.out.print("Enter Hight");
		double height = sc.nextDouble();
		
		System.out.print("Enter weight");
		double weight = sc.nextDouble();
		
		BMICalculator bmi = new BMICalculator();
		System.out.println("Your BMI is :"+bmi.calculateBMI(height,weight));
		sc.close();
		

	}

}
