package com.lab.dec_03;
import java.util.Scanner;
import java.util.function.*;

public class NumberTester {
	
public static void main(String[] args) 
	{
	
		Predicate<Integer> prd = num ->
		{
			for(int i=2; i<num/2;i++) 
			{
				if(num%i==0)
				{
					return false;
				}
			}
			return true;
		};
	
	System.out.println("Enter a number to check : ");
	Scanner sc = new Scanner(System.in);
	int number = sc.nextInt();
	System.out.println("Number is prime : "+prd.test(number));
	sc.close();	
}
}
