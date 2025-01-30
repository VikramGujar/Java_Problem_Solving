package com.lab.jan_30;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEmployee 
{

	public static void main(String[] args) 
	{
		List<Employee> listOfEmp = new ArrayList<Employee>();
		List<Employee> filteredList = new ArrayList<Employee>();
		
		
		listOfEmp.add(new Employee(111, "Harun", 20000D));
		listOfEmp.add(new Employee(111, "Sanket", 15000D));
		listOfEmp.add(new Employee(111, "Sai", 50000D));
		listOfEmp.add(new Employee(111, "Nikhil", 90000D));
		listOfEmp.add(new Employee(111, "Amjad", 40000D));
		
		filteredList = listOfEmp.stream().filter(emp -> emp.salary()>30000).collect(Collectors.toList());
		
		filteredList.forEach(emp -> System.out.println(emp.name()));
	}

}

/*
 * Create a record of Employee with attributes name:(String) and id:(String)
Given a list of Employee objects with name and salary properties, 
write a program to filter the list of Employees by salary in who 
are having salary > 30000 and print the employee names.

*/
