package com.vikram.test;

public class CourseEnrollment extends Student {

	String courseName;
	String grade;
	
	
	public CourseEnrollment(String name, int age, int studentId, String courseName, String grade) {
		super(name, age, studentId);
		this.courseName = courseName;
		this.grade = grade;
	}


	@Override
	public String toString() {
		return "CourseEnrollment [courseName=" + courseName + ", grade=" + grade + ", studentId=" + studentId
				+ ", name=" + name + ", age=" + age + ", getStudentDetails()=" + getStudentDetails() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}
