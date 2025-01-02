package com.lab.jan_02;

import java.util.ArrayList;
import java.util.Scanner;

public class Directory 
{
	private ArrayList<Employee> employeeList;
	
	
	public Directory() {
		super();
		this.employeeList = new ArrayList<Employee>();
	}

	public void addEmployee(Employee e)
	{
		employeeList.add(e);
	}
	
	public void displayAllEmployees()
	{
		for(Object o:employeeList)
		System.out.println(o);
	}
	
	public void updateEmployee(int index) 
	{
		Employee e = employeeList.get(index);
		System.out.println("Update emp");
		e.setSalary(5000);
		System.out.println("Updated succesfully!!!");
	}
	
	public void deleteEmployee(int index, Employee e)
	{
		employeeList.remove(index);
	}
	
	
	
}
/*

Directory Class:
This class manages a collection of Employee objects using an ArrayList.
The addEmployee() method adds an employee to the directory.
The displayAllEmployees() method prints details of all employees in the directory.
The updateEmployee() method updates an employee's information at a specified index in the directory.
The deleteEmployee() method removes an employee from the directory at a specified index.
*/