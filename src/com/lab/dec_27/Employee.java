package com.lab.dec_27;

public class Employee 
{

	private String name;
	private int employeeId;
	private double salary;
	
	public Employee()
	{
		
	}
	
	public Employee(String name, int employeeId, double salary) 
	{
		super();
		this.name = name;
		this.employeeId = employeeId;
		this.salary = salary;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
}

