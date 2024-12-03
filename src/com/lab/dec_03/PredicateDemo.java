package com.lab.dec_03;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateDemo
{
	public static void main(String[] args)
	{
		
		Predicate<Integer> p = num -> num% 2==0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		int no =sc.nextInt();
		System.out.println(no+" is even ?"+p.test(no));
		sc.close();
	}
}

