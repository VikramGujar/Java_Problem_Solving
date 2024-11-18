package com.vikram.test;

public class Student extends Person {

	int studentId;

	public Student(String name, int age, int studentId) {
		super(name, age);
		this.studentId = studentId;
	}
	
	public String getStudentDetails()
	{
		return "Name "+this.name+"Age"+this.age+"Id"+this.studentId;
	}
}
