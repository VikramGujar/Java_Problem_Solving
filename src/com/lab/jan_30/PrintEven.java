package com.lab.jan_30;

import java.util.stream.Stream;

public class PrintEven 
{

	public static void main(String[] args) 
	{
		Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).filter(n -> n % 2==0)
		.forEach(System.out::println);
		

	}

}
/*
Write a Java program that creates a stream of integers using Stream.of, 
filters out the even numbers and then prints each squared number using forEach.
Input (Stream):
1, 2, 3, 4, 5, 6, 7, 8, 9, 10
Output:
2
4
6
8
10

*/