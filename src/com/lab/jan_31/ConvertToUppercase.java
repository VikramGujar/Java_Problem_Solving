package com.lab.jan_31;

import java.util.Arrays;
import java.util.List;

public class ConvertToUppercase {

	public static void main(String[] args) {
		List<String> strList = Arrays.asList("Virat","Ad de Villiers", "Dhoni", "Rohit");
		
		strList.stream().map(str -> str.toUpperCase()).forEach(System.out::println);

	}

}
/*

2. Write a program to convert all the strings in a list to 
uppercase and print the result using the Stream API.

*/