package com.lab.jan_02;

public class Employee 
{
	private String name;
	private String position;
	private double salary;
	
	
	public Employee(String name, String position, double salary) {
		super();
		this.name = name;
		this.position = position;
		this.salary = salary;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPosition() {
		return position;
	}


	public void setPosition(String position) {
		this.position = position;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", position=" + position + ", salary=" + salary + "]";
	}
	
	
}
/*

program-1
Employee Directory:
Develop an employee directory that stores employee information 
(name, position, salary) and allows CRUD operations using collections.

Employee Class:
This class represents an employee with attributes like 
It has a constructor to initialize an employee's details 
and getters/setters to access and modify these details.
The toString() method is overridden to provide a string representation of an employee's details.

EmployeeDirectoryExample Class (Main Class):
This class contains the main() method where an instance of Directory is created.
Two employees, "Alice" and "Bob," are added to the directory with their respective positions and salaries.
The displayAllEmployees() method is called to show all employees.
The details of "Bob" are updated to reflect a change in position and salary.
"Alice" is deleted from the directory.
Finally, the updated list of employees is displayed again.


Output:-
Employee{name='Alice', position='Manager', salary=60000.0}
Employee{name='Bob', position='Developer', salary=50000.0}

Employee{name='Alice', position='Manager', salary=60000.0}
Employee{name='Bob', position='Senior Developer', salary=55000.0}

Employee{name='Bob', position='Senior Developer', salary=55000.0}

Initial display after adding "Alice" as a Manager and "Bob" as a Developer.
Display after updating "Bob's" information to reflect the change in position and salary.
Display after deleting "Alice" from the directory.
Final display of the remaining employee, "Bob", with his updated information.
*/