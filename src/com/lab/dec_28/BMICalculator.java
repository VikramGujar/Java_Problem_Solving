package com.lab.dec_28;

public class BMICalculator 
{

	public double calculateBMI(double weight, double height)
	{
		if(weight<0 || height <0)
			throw new IllegalArgumentException("Weight or hight can not be negative");
		double BMI = weight / (height * height);
		return BMI;
	}
}
/*

Create a program to calculate BMI based on user-provided weight and height. 
Implement robust error-handling mechanisms to ensure valid input and meaningful results.

Problem Description:
Create a BMICalculator class:

Implement a method calculateBMI(double weight, double height) to compute BMI using the formula:
BMI = weight / (height * height)
Ensure the BMI value is returned with two decimal precision.
Error Handling:

Handle the following scenarios:
Non-Numeric Input: If the user enters non-numeric weight or height, throw a NumberFormatException with the message: "Invalid input: Numeric value expected for weight and height."
Negative or Zero Values: If weight or height is less than or equal to zero, throw an IllegalArgumentException with the message: "Invalid input: Weight and height must be positive values."
Unrealistic Height: If height is greater than 3 meters, throw a RuntimeException with the message: "Invalid input: Height exceeds realistic human range."
Develop a BMICalculatorTester class:

Implement a main method that:
Prompts the user to enter weight (in kilograms) and height (in meters).
Calls the calculateBMI method to compute the BMI.
Displays the BMI or the appropriate error message if an exception occurs.

Example:
Input 1:
Enter weight (kg): 70
Enter height (m): 1.75

Output 1:
Your BMI is: 22.86

Input 2:
Enter weight (kg): -45
Enter height (m): 1.5

Output 2:
Invalid input: Weight and height must be positive values.

Input 3:
Enter weight (kg): 60
Enter height (m): 3.5

Output 3:
Invalid input: Height exceeds realistic human range.



*/