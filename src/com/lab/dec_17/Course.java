package com.lab.dec_17;

public class Course 
{
	private int courseId;
	private String courseName;
	private double corseFee;
	
	
	public Course(int courseId, String courseName, double corseFee) 
	{
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.corseFee = corseFee;
	}


	public int getCourseId() {
		return courseId;
	}


	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}


	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	public double getCorseFee() {
		return corseFee;
	}


	public void setCorseFee(double corseFee) {
		this.corseFee = corseFee;
	}


	@Override
	public String toString() 
	{
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", corseFee=" + corseFee
				+"]";
	}
	
	
	
	
	

}
