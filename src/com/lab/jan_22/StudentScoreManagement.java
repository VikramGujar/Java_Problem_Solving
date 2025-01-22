package com.lab.jan_22;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class StudentScoreManagement 
{
	public static TreeMap<String, Integer> stdData = new TreeMap<String, Integer>();
	
	public static void addStudent(String name, Integer marks)
	{
		stdData.put(name, marks);
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("\n****- Student Managment System-*****\n");
			System.out.println(""
					+ "1.Add Student\n"
					+ "2.Display all\n"
					+ "4.Exit");
			System.out.println("\tEnter your choice :");
			int ch = sc.nextInt();
			
			switch (ch) 
			{
			case 1:
				System.out.println("Enter your name :");
				String name = sc.next();
				
				System.out.println("Enter your marks :");
				int marks = sc.nextInt();
				
				addStudent(name, marks);
				break;
				
			case 2:
				
				Set<Entry<String, Integer>> entrySet = stdData.entrySet();
				 
			 for (Entry<String, Integer> entry : entrySet) {
				 
				 System.out.println(entry.getKey() +"--> "+entry.getValue());
				
			}
				//stdData.forEach((k,v)- System.out.println(k+"--->"+v)
				break;
				
			case 4:
				System.out.println("Thank You for visit");
				System.exit(0);
				
			default:
				System.err.println("Invalid Input");
			}
			
			
		}
		
		
	}
}
