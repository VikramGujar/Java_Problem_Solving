package com.lab.jan_31;

import java.util.ArrayList;
import java.util.List;

record Person(Integer age, String name ) {}

public class SortByAge 
{

	public static void main(String[] args) 
	{
		List<Person> personList = new ArrayList<Person>();
		
		personList.add(new Person(22, "Nilesh"));
		personList.add(new Person(21, "Nikhil"));
		personList.add(new Person(19, "Yash"));
		personList.add(new Person(23, "Viky"));
		personList.add(new Person(38, "Ravi"));
		
		personList.stream().sorted((p1,p2) -> p1.age().compareTo(p2.age()))
		.forEach(System.out::println);

	}

}
/*
1. Given a list of Person objects with name and age properties, 
write a program to sort the list of persons by age in ascending order using the Stream API.
*/