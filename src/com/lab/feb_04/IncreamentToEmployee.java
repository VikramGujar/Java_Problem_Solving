package com.lab.feb_04;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

record Employee(String name, Double salary,Integer exp) 
{

	public Employee SalIncreament()
	{
		Double newSal = this.salary()+ (this.salary()* 0.1);
		return new Employee(this.name, newSal, this.exp);
	}
}

public class IncreamentToEmployee 
{

	public static void main(String[] args) 
	{
	List<Employee> empList = new ArrayList<Employee>();

	empList.add(new Employee("John", 50000D, 6));
	empList.add(new Employee("Jane", 45000D, 4));
	empList.add(new Employee("Tom", 60000D, 7));
	empList.add(new Employee("Lucy", 52000D, 5));
	empList.add(new Employee("Anna", 48000D, 8));
	
	
	List<Employee> updatedEmp = empList.stream().map(emp -> emp.exp()>5 ? emp.SalIncreament():emp)
	.collect(Collectors.toList());
	
	updatedEmp.forEach(System.out::println);
	
	
	
	
	}

}
/*
Ques - 4
---------------
Given a list of Employee objects, 
where each employee has a name, salary, and years of experience, 
write a Java program to increase the salary of employees 
with more than 5 years of experience by 10%. 
Use the Stream API to perform this operation and then print all the employees.

Test Input:
Employee("John", 50000, 6));
Employee("Jane", 45000, 4));
Employee("Tom", 60000, 7));
Employee("Lucy", 52000, 5));
Employee("Anna", 48000, 8));

Expected Output:
Employee{name='John', salary=55000.0, yearsOfExperience=6}
Employee{name='Jane', salary=45000.0, yearsOfExperience=4}
Employee{name='Tom', salary=66000.0, yearsOfExperience=7}
Employee{name='Lucy', salary=52000.0, yearsOfExperience=5}
Employee{name='Anna', salary=52800.0, yearsOfExperience=8}
*/