package com.lab.dec_27;

import java.util.Scanner;

public class EmployeeTester {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee details");
		
		
		// Clerk
		System.out.println("Clerk");
		
		System.out.print("Name :");
		String name =sc.next();
		
		System.out.print("Id :");
		int empId = sc.nextInt();
		
		System.out.print("Salary :");
		double sal =  sc.nextDouble();
		
		System.out.print("Speed :");
		int speed = sc.nextInt();
		
		System.out.print("Accuracy :");
		int accuracy = sc.nextInt();
		
		Clerk Cleark1 = new Clerk(name, empId, sal, speed, accuracy);
		System.out.println(Cleark1.getName()+" Has salary "+Cleark1.getSalary());
		Cleark1.setSpeed(90);
		Cleark1.setAccuracy(90);
		System.out.println(Cleark1.getName()+" Has salary "+Cleark1.getSalary());
		
		// Manager 
		
		System.out.println("\n\nManager");
		
		System.out.print("Name :");
		String Mname =sc.next();
		
		System.out.print("Id :");
		int MempId = sc.nextInt();
		
		System.out.print("Salary :");
		double Msal =  sc.nextDouble();
		Manager m1 = new Manager(Mname, MempId, Msal, ManagerType.HR);
		System.out.println(m1);

	}

}
