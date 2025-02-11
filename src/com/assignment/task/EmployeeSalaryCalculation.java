package com.assignment.task;

public class EmployeeSalaryCalculation 
{
	//Given data
	private double basicSalary = 50000;	// Basic Salary
	private double hra = basicSalary * 0.20; // HRA is 20% of Basic Salary
	private double da = basicSalary * 0.50;	// DA is 50% of Basic Salary
	private double grossSalary = (basicSalary + hra + da); // Gross Salary (Basic + HRA + DA)
	private double taxDeduction = grossSalary * 0.10; // Tax deduction (10% of Gross Salary)
	private double netSalary = (grossSalary-taxDeduction); // Net Salary (Gross Salary - Tax Deduction)
	
	// Method to print salary details
	public void printSalaryDetailes()
	{
		// Printing Salary Details
		System.out.println("Gross Salary = "+grossSalary);
		System.out.println("Tax Deduction = "+taxDeduction);
		System.out.println("Net Salary = "+netSalary);
	}

	// Main method for execution
	public static void main(String[] args) 
	{
		// Creating Object of EmployeeSalaryCalculation Class
		EmployeeSalaryCalculation salCal = new EmployeeSalaryCalculation();
		
		// Calling printSalaryDetailes() method to print Salary Details
		salCal.printSalaryDetailes();
		        
	}

}


/*
Task 1: Employee Salary Calculation

Problem:
Write a Java program that asks the user to enter the basic salary of an employee 
and calculates:

a) Gross Salary (Basic + HRA + DA)
b) Tax deduction (10% of Gross Salary)
c) Net Salary (Gross Salary - Tax Deduction)

Conditions:

HRA is 20% of Basic Salary
DA is 50% of Basic Salary
I/P: Basic Salary = 50000

O/P: Gross Salary = 85000

Tax Deduction = 8500

Net Salary = 76500
 */
