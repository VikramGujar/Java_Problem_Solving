package com.lab.dec_27;

public class EmployeeTester {

	public static void main(String[] args) 
	{
		// Clerk
		Clerk Jatin = new Clerk("Jatin", 101, 15000, 60, 70);
		System.out.println(Jatin.getName()+" Has salary "+Jatin.getSalary());
		Jatin.setSpeed(90);
		Jatin.setAccuracy(90);
		System.out.println(Jatin.getName()+" Has salary "+Jatin.getSalary());
		
		// Manager 
		Manager Harun = new Manager("Harun", 102, 20000, ManagerType.HR);
		System.out.println(Harun);

	}

}
