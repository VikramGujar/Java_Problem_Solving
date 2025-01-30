package com.lab.jan_30;

import java.util.stream.Stream;

public class ConcateStrings 
{

	public static void main(String[] args) 
	{
		
		Stream.of("Hello", "", "World", " ", "from", " ", "Java", "!")
		.filter(str -> !str.isEmpty()).forEach(System.out::print);
		
		

	}

}
/*
Write a Java program that uses the Stream.of method to create a stream of strings, 
filters out the empty strings, and then concatenate the remaining strings into a single string..

Input:
A stream of strings ["Hello", "", "World", " ", "from", " ", "Java", "!"].

Output:
A single concatenated string:
HelloWorld from Java!
*/