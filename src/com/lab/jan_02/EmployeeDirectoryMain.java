package com.lab.jan_02;

public class EmployeeDirectoryMain 
{

	public static void main(String[] args) 
	{
		Employee emp1 = new Employee("Vikram", "HR", 20000);
		Employee emp2 = new Employee("Harun", "Manager", 40000);
		Employee emp3 = new Employee("Swapnil", "Devolper", 60000);
		
		Directory d = new Directory();
		d.addEmployee(emp1);
		d.addEmployee(emp2);
		d.addEmployee(emp3);
		
		System.out.println("All the avalable employees:");
		d.displayAllEmployees();
		d.updateEmployee(0);
		System.out.println("Update Vikrams Sal");
		System.out.println("After update");
		d.displayAllEmployees();
		
		
		

	}

}
/*
EmployeeDirectoryExample Class (Main Class):
This class contains the main() method where an instance of Directory is created.
Two employees, "Alice" and "Bob," are added to the directory with their respective positions and salaries.
The displayAllEmployees() method is called to show all employees.
The details of "Bob" are updated to reflect a change in position and salary.
"Alice" is deleted from the directory.
Finally, the updated list of employees is displayed again.
*/