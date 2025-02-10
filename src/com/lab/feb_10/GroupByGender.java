package com.lab.feb_10;
//7.Group Employees by Gender:
//  Group employees by gender and return
//  a map with gender as the key and a list of employees as the value.

import java.util.*;
import java.util.stream.Collectors;

import com.lab.feb_09.Employee;

public class GroupByGender 
{

	public static void main(String[] args) 
	{
		List<Employee> list = new ArrayList<>();
		Employee employee1 = new Employee("Anna", 27, 50000.0, "Male");
		Employee employee2 = new Employee("Sai", 27, 51000.0, "Female");
		Employee employee3 = new Employee("Bob", 27, 52000.0, "Male");
		Employee employee4 = new Employee("Pratiksha", 28, 53000.0, "Female");
		Employee employee5 = new Employee("Smith", 29, 53000.0, "Male");
		Employee employee6 = new Employee("Sahili", 30, 55000.0, "Female");
		Employee employee7 = new Employee("Milind", 31, 56000.0, "Male");
		Employee employee8 = new Employee("Sejal", 32, 57000.0, "Female");
		Employee employee9 = new Employee("Om", 35, 58000.0, "Male");
		Employee employee10 = new Employee("Pravalika", 35, 59000.0, "Female");

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
		
		list.stream().collect(Collectors.groupingBy(Employee::gender))
		.forEach((K,V)-> System.out.println("Key : "+K+", Value : "+V+""));

	}

}
