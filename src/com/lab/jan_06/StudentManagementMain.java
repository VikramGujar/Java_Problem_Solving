package com.lab.jan_06;

import java.util.Scanner;

public class StudentManagementMain 
{

	public static void main(String[] args) 
	{
		StudentManagement sm = new StudentManagement();
		Scanner sc = new Scanner(System.in);
		System.out.println("Well-come to Student management system\n");
		while(true)
		{
			System.out.println("Enter your choice");
			System.out.println("\t1] Add student");
			System.out.println("\t2] Remove student");
			System.out.println("\t3] Display student");
			System.out.println("\t4] Exit");
			
			int choice = sc.nextInt();
			
			switch (choice) 
			{
				case 1: 
				{
					System.out.print("Enter student to add : ");
					String std = sc.next();
					sm.addStudent(std);
					break;
				}
				case 2: 
				{
					System.out.print("Enter student to remove : ");
					String std = sc.next();
					sm.removeStudent(std);
					break;
				}
				case 3: 
				{
					sm.displayStudents();
					break;
				}
				case 4: 
				{
					System.out.println("Thank You for your visit ");
					System.out.println("Bye bye!!!");
					System.exit(choice);
				}
			default:
				System.err.println("Invalid choice try again!!!");
			}
		}

	}

}
