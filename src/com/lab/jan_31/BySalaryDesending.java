package com.lab.jan_31;

import java.util.ArrayList;
import java.util.List;

record Employee(Integer id, String name, Double salary) {}

public class BySalaryDesending {

	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<Employee>();
		
		empList.add(new Employee(111, "Nikhil", 1800D));
		empList.add(new Employee(222, "Viky", 1900D));
		empList.add(new Employee(333, "Nilesh", 4000D));
		empList.add(new Employee(444, "Rahul", 2200D));
		empList.add(new Employee(555, "Sanket", 1700D));
		
		empList.stream().sorted((e1,e2) -> e1.salary().compareTo(e2.salary()))
		.forEach(System.out::println);

	}

}
/*
3. Given a list of Employee objects with id and salary properties, 
write a program to sort the list of Employees by salary in descending 
order using the Stream API.
*/
