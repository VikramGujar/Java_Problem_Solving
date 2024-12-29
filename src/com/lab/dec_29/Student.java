package com.lab.dec_29;

public abstract class Student 
{
	
	protected String studentName;
	protected String studentClass;
	protected static int inttotalNoOfStudents;
	
	

	public Student() 
	{
		super();
	}

	public Student(String studentName, String studentClass) 
	{
		super();
		this.studentName = studentName;
		this.studentClass = studentClass;
	}

	public synchronized void increamentTotalNoOfStudent()
	{
		System.out.println("Total Student are :"+(++inttotalNoOfStudents));
	}
	
	public abstract int getPercentage();
	
	public static int getTotalNoOfStudent()
	{
		return 1;
	}


}
