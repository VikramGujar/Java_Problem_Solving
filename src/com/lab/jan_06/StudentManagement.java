package com.lab.jan_06;

import java.util.HashSet;
import java.util.Set;

public class StudentManagement 
{
	//To store the names of students
	private Set<String> students = new HashSet<>();
	
	//Add the student name to the students set.
	public void addStudent(String name) 
	{
		if(name==null)
		System.out.println("Null not allowed");
		else if(students.contains(name))
		System.out.println(name+" already exist!!!");
		else 
		{
			students.add(name);
			System.out.println(name+" succesfully added!!!");
		}
			
		
	}
	//Remove the student name from the students set.
	public void removeStudent(String name) 
	{
		if(!students.contains(name))
			System.out.println("Name dose not exist");
		else
		{
			students.remove(name);
			System.out.println(name+" removed succesfully!!!");
		}
	}
	
	//Print all student data
	public void displayStudents()
	{
		System.out.println("Studen List : ");
		if(students.isEmpty())
			System.out.println("No student avalable!!!");
		else
			students.forEach(System.out::println);
	}
	


	
}
/*
Q1)

Create class StudentManagement 
-------------------------------
Instance Variable :
private Set<String> students = new HashSet<>();   -> 
.

Method Declarations :
addStudent(String name)  
Attempts to add the student name to the students set.
Prints a confirmation message if added successfully.
Prints a message indicating a duplicate if the name already exists.

removeStudent(String name) :
Attempts to remove the student name from the students set.
Prints a confirmation message if removed successfully.
Prints a message indicating the student was not found if the name does not exist in the set.

displayStudents()
Checks if the students set is empty.
Prints a message if there are no students.
Iterates over the students set and prints each student name.

Main Method
Creates an instance of StudentManagement.
Uses a Scanner for user input.
Displays a menu with options to add, remove, display students, or exit.
Executes the corresponding method based on user choice.
User Interaction Loop


Conditions :
-----------

if StudentManagement = null || Scanner sc = null then print "Error.... Error Object is null"
if choise<=0 || choise >=5 then print "Error.... Invalid choice"


TEST CASE 1 :
-------------
sample input  : StudentManagement obj = null || Scanner sc = null
sample output : Error.... Error Object is null


TEST CASE 2 :
-------------
sample input  : StudentManagement obj = new StudentManagement();
                Scanner sc=new Scanner(System.in);
                int choise<=0 || choise >=5 
sample output : Error.... Invalid choice


TEST CASE 3 :
-------------
sample input  : StudentManagement obj = new StudentManagement();
                Scanner sc=new Scanner(System.in);
                int choise >=1 || choise <= 4

sample output :

1. Add a Student
2. Remove a Student
3. Display Students
4. Exit
Enter your choice: 1
Enter student name: John Doe
Student added: John Doe

1. Add a Student
2. Remove a Students
3. Display Students
4. Exit
Enter your choice: 1
Enter student name: Jane Smith
Student added: Jane Smith

1. Add a Student
2. Remove a Student
3. Display Students
4. Exit
Enter your choice: 1
Enter student name: John Doe
Duplicate student name: John Doe

1. Add a Student
2. Remove a Student
3. Display Students
4. Exit
Enter your choice: 3
Students in the system:
John Doe
Jane Smith

1. Add a Student
2. Remove a Student
3. Display Students
4. Exit
Enter your choice: 2
Enter student name: Alice Johnson
Student not found: Alice Johnson

1. Add a Student
2. Remove a Student
3. Display Students
4. Exit
Enter your choice: 2
Enter student name: Jane Smith
Student removed: Jane Smith

1. Add a Student
2. Remove a Student
3. Display Students
4. Exit
Enter your choice: 3
Students in the system:
John Doe

1. Add a Student
2. Remove a Student
3. Display Students
4. Exit
Enter your choice: 4
Exiting...
*/