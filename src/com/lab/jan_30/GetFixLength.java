package com.lab.jan_30;

import java.util.ArrayList;
import java.util.List;

public class GetFixLength {

	public static void main(String[] args) 
	{
		
		List<String> list = new ArrayList<String>();
		list.add("Toby");
		list.add("Anna");
		list.add("Leroy");
		list.add("Alexa");
		list.add("Tony");
		
		list.stream().filter(str -> str.length()==4).sorted()
		.forEach(System.out::println);
		

	}

}
/*
Write a Java program that processes a list of names to 
filter, sort, and print names with a length of exactly 4 characters.
Requirements:
Use a list of strings containing names as input.
Filter out names that are not exactly 4 characters long.
Sort the filtered names in lexicographical order (alphabetical order).
Limit the output to the first 2 names after sorting.
Print each name on a new line.

Input : 
A List of strings: ["Toby", "Anna", "Leroy", "Alex"]
Expected Output:
Anna
Alex
*/