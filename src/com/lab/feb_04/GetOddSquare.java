package com.lab.feb_04;

import java.util.*;

public class GetOddSquare 
{

	public static void main(String[] args) 
	{
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		numbers.stream().filter(n -> n%2!=0).map(n -> n*n).forEach(System.out::println);
	}

}

/*
Ques - 1
-----------------------
Filtering and Mapping:
Write a Java 8 stream pipeline that takes a list of integers and filters out the even numbers, then squares each remaining number, and finally prints the result.

Input:
List<Integer> numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
Output:
1
9
25
49
81
*/