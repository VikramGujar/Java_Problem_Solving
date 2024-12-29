package com.lab.dec_29;

public class ScienceStudent extends Student
{
	private int physicsMarks, chemistryMarks, mathsMarks;
	private int percentage;	// [ calculated by getPercentage ]
	private boolean percentageCalculated = false;
	
	public ScienceStudent() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public ScienceStudent(int physicsMarks, int chemistryMarks, int mathsMarks, String studentName, String studentClass) {
		super(studentName, studentClass);
		this.physicsMarks = physicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathsMarks = mathsMarks;
		
	}

	
	@Override
	public int getPercentage() 
	{
		int percentage = (physicsMarks * chemistryMarks * mathsMarks) * (3/100);
		percentageCalculated = true;
		isPromoted();
		increamentTotalNoOfStudent();
		return percentage;
	}
	
	public synchronized void isPromoted()
	{
		while(!percentageCalculated)
		{
			System.out.println("Waiting for percentage calculation");
			try 
			{
				wait();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		if((physicsMarks < 40 || chemistryMarks <40 || mathsMarks < 40) && percentage < 60)
		{
			System.out.println("Student Failed! Not Promoted to next batch.");
			
		}else
		{
			System.out.println(this);
			System.out.println("Congratulations!!! You are promoted to next Batch.");
			
		}
			
	}


	@Override
	public String toString() {
		return "ScienceStudent [physicsMarks=" + physicsMarks + ", chemistryMarks=" + chemistryMarks + ", mathsMarks="
				+ mathsMarks + ", percentage=" + percentage + ", percentageCalculated=" + percentageCalculated
				+ ", studentName=" + studentName + ", studentClass=" + studentClass + "]";
	}
	
	

}
