package com.assignment.task;

import java.util.Scanner;

public class EmployeeSalaryCalculation 
{
	//Given data
	private double basicSalary;	// Basic Salary
	private double hra; // HRA is 20% of Basic Salary
	private double da;	// DA is 50% of Basic Salary
	private double grossSalary ; // Gross Salary (Basic + HRA + DA)
	private double taxDeduction; // Tax deduction (10% of Gross Salary)
	private double profetionalTax; 
	private double travelAl ;
	private double netSalary; // Net Salary (Gross Salary - Tax Deduction)
	
	
	public void calculate ()
	{
		this.hra = basicSalary * 0.20; // HRA is 20% of Basic Salary
		this.da = basicSalary * 0.50;	// DA is 50% of Basic Salary
		this.grossSalary = (basicSalary + hra + da); // Gross Salary (Basic + HRA + DA)
		this.taxDeduction = grossSalary * 0.10; // Tax deduction (10% of Gross Salary)
		this.profetionalTax = 200; 
		
		this.netSalary =grossSalary-taxDeduction; // Net Salary (Gross Salary - Tax Deduction)
		this.netSalary = netSalary - profetionalTax;
		this.travelAl = netSalary * 0.05;
		this.netSalary = netSalary + travelAl;
	}
	
	// Method to print salary details
	public void printSalaryDetailes()
	{
		// Printing Salary Details
		System.out.println("Gross Salary = "+grossSalary);
		System.out.println("Tax Deduction = "+taxDeduction);
		System.out.println("Net Salary = "+netSalary);
	}
	
	public void setBasicSalary(double sal)
	{
		this.basicSalary = sal;
	}

	// Main method for execution
	public static void main(String[] args) 
	{
		// Creating Object of EmployeeSalaryCalculation Class
		EmployeeSalaryCalculation salCal = new EmployeeSalaryCalculation();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter basic Salary :");
		double sal = Double.parseDouble(sc.nextLine());
		
		salCal.setBasicSalary(sal);
		salCal.calculate();
		
		
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

76300
// 80,115


 */
