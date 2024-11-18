package com.vikram.test;

public class StudentCourseManagement {

	public static void main(String[] args) {
		
		Person p = new Person("Vikram",21);
		Student st = new Student("Vikram",21,1);
		CourseEnrollment c = new CourseEnrollment("Vikram",21,1,"Java","B");
		
		System.out.println(c);
		
		

	}

}
