package com.lab.feb_10;
// Count how many employee present male/female

import java.util.*;

import com.lab.feb_09.Employee;

public class CountGender 
{

	public static void main(String[] args) 
	{
		List<Employee> list = new ArrayList<>();
		Employee employee1 = new Employee("Anna", 27, 50000.0, "Male");
		Employee employee2 = new Employee("Sai", 27, 51000.0, "Male");
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
		
		long Mcount = list.stream().filter(e -> e.gender()=="Male").count();
		long Fcount = list.stream().filter(e -> e.gender()=="Female").count();
		
		System.out.println("Male : "+Mcount+" Female : "+Fcount+"");

	}

}
