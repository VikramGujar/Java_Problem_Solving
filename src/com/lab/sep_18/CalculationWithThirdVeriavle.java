package com.lab.sep_18;

import java.util.Scanner;

public class CalculationWithThirdVeriavle 
{
	
	final static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) 
	{
		int a, b, choice; 
		
		System.out.println("Enter numbers to calculate ");
		System.out.print("\t\t 1st Number :");
		a = sc.nextInt();
		System.out.print("\t\t 2nd Number :");
		b = sc.nextInt();
		
		System.out.print("\nWhich operation you want to perform\n");
		System.out.println("1. ADD");
		System.out.println("2. SUB");
		System.out.println("3. MUL");
		System.out.println("4. MOD");
		System.out.println("5. DIV");
		System.out.println("YOUR CHOICE :");
		choice = sc.nextInt();
		
		switch (choice) 
		{
			case 1: 
			{
				add(a, b);
				break;
			}
			case 2: 
			{
				sub(a, b);
				break;
			}
			case 3: 
			{
				mul(a, b);
				break;
			}
			case 4: 
			{
				mod(a, b);
				break;
			}
			case 5: 
			{
				div(a, b);
				break;
			}
		default:
			throw new IllegalArgumentException("Unexpected value: " + choice);
		}
		

	}
	
	public static void add(int a, int b)
	{
		System.out.println(a+b);		
	}
	
	public static void sub(int a, int b)
	{
		System.out.println(a-b);
	}
	
	public static void mul(int a, int b)
	{
		System.out.println(a*b);
	}
	
	public static void mod(int a, int b)
	{
		System.out.println(a%b);
	}
	
	public static void div(int a, int b)
	{
		try 
		{
			if(b == 0)
				throw new ArithmeticException("Can not divide by 0");
			System.out.println(a/b);
		} catch (ArithmeticException e) 
		{
			System.out.println(e.getMessage());
		}
		
	}

}
