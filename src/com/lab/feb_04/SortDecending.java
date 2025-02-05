package com.lab.feb_04;

import java.util.*;

public class SortDecending 
{

	public static void main(String[] args) 
	{
		List<String> strings =Arrays.asList("apple", "banana", "orange", "grape", "pear");
		
		strings.stream().sorted((str1, str2) -> str2.compareTo(str1))
		.forEach(System.out::println);

	}

}
/*
Ques - 2
-------------------
Sorting:
Write a program to sort a list of strings in descending order using Java 8 streams.
Input:
List<String> strings = ["apple", "banana", "orange", "grape", "pear"];
Expected Output:
Sorted Strings in Descending Order:
pear
orange
grape
banana
apple
*/