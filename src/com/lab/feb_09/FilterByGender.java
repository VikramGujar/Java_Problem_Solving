package com.lab.feb_09;
// 1. Filter Employees by Gender

import java.util.*;

public class FilterByGender 
{

	public static void main(String[] args) 
	{
		List<Employee> list = new ArrayList<>();
		
		Employee employee1 = new Employee("Anna", 27, 50000.0, "Male");
		Employee employee2 = new Employee("Employee 2", 27, 51000.0, "Female");
		Employee employee3 = new Employee("Bob", 27, 52000.0, "Male");
		Employee employee4 = new Employee("EmplSmithoyeeee 4", 28, 53000.0, "Female");
		Employee employee5 = new Employee("Employee 5", 29, 53000.0, "Male");
		Employee employee6 = new Employee("Employee 6", 30, 55000.0, "Female");
		Employee employee7 = new Employee("EmSmithployee 7", 31, 56000.0, "Male");
		Employee employee8 = new Employee("Employee 8", 32, 57000.0, "Female");
		Employee employee9 = new Employee("Employee 9", 35, 58000.0, "Male");
		Employee employee10 = new Employee("EMPLOYEEeeseeee 10", 35, 59000.0, "Female");

		list.add(employee1);
		list.add(employee2);
		list.add(employee3);
		list.add(employee4);
		list.add(employee5);
		list.add(employee6);
		list.add(employee7);
		list.add(employee8);
		list.add(employee9);
		list.add(employee10);
	
		
		System.out.println("Filtered Males");
		System.out.println("===============\n");
	    list.stream().filter(e -> e.gender()=="Male").forEach(System.out::println);
	    
	    
	    System.out.println("\n============================================\n");
	    
	    
	    
	    System.out.println("Filtered Females");
	    System.out.println("================");
	    list.stream().filter(e -> e.gender()=="Female").forEach(System.out::println);

	}

}
