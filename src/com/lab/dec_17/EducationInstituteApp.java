package com.lab.dec_17;

public class EducationInstituteApp {

	public static void main(String[] args) {
		
		Course c1 = new Course(101,"Java Full Stack", 3000);
		Course c2 = new Course(102,"Dot-Net Full Stack", 2100);
		Course c3 = new Course(103,"Python Full Stack", 1500);
		
		Offer of1 = new Offer("10% discount");
		Offer of2 = new Offer("30% discount");
		Offer of3 = new Offer("20% discount");
		
		Course courses[] = {c1, c2, c3};
		Offer offers[] = {of1, of2, of3}; 
		
		EducationInstitute ei = new EducationInstitute(courses, offers);
		Student st1 = new Student("Virat", ei);
		Student st2 = new Student("Dhoni", ei);
		
		Thread th2 = new Thread(st1);
		Thread th1 = new Thread(st2);
		th1.start(); th2.start();
		
		
		
	}

}
/*
 * It creates an education institute, 
 * initializes students, 
 * and allows them to view course details, 
 * ongoing offers, 
 * and enroll in courses concurrently without disturbing the execution flow of each thread.



Instructions for Students:

-> Implement the above classes and their methods following the given specifications.

-> Create an instance of EducationInstitute, and initialize courses and offers with hardcoded data for simplicity.

-> Create two students: Virat and Dhoni. Allow them to view available courses, check ongoing offers, and enroll in their preferred courses concurrently using threads.

-> Use the Thread class to simulate concurrent student interactions. Ensure that the system provides a responsive user experience for multiple students.

-> Test your program with multiple executions and verify that students can view course details, offers, and enroll without conflicts.

-> Feel free to enhance the program with additional features or error handling to further improve its functionality.



[Note : Include appropriate comments and use meaningful variable names to make your code more readable and understandable.]

/
 */