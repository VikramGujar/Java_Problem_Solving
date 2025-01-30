package com.lab.jan_30;

import java.text.Collator;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumOfSquareOfPositive {

	public static void main(String[] args) 
	{
		List<Integer> pos = new ArrayList<Integer>();
		pos = Stream.of(-3, 2, -5, 6, -1, 4).filter(n -> n>0).collect(Collectors.toList());
		
		int sum = 0;
		
		for(int n : pos)
		{
			sum =  sum + (n*n);
		}
		
		System.out.println("Sum of squares of positive numbers: "+sum);

	}

}
/*
 * Write a Java program that reads an array of integers, 
 * filters out the negative numbers, and then calculates the 
 * sum of the squares of the remaining positive numbers using streams and the reduce method.

Input:
Input array: [-3, 2, -5, 6, -1, 4]
Output:
Sum of squares of positive numbers: 52
*/
