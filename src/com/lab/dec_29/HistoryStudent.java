package com.lab.dec_29;

public class HistoryStudent extends Student
{

	private int historyMarks, civilMarks;
	private int percentage;	// [ calculated by getPercentage ]
	private boolean percentageCalculated = false;
	
	
	
	public HistoryStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public HistoryStudent(int historyMarks, int civilMarks, String studentName, String studentClass) {
		super(studentName, studentClass);
		this.historyMarks = historyMarks;
		this.civilMarks = civilMarks;
	}



	@Override
	public int getPercentage() 
	{
		int percentage = (historyMarks * civilMarks) * (2/100);
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
		if((historyMarks <40 || civilMarks < 40) && percentage < 60)
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
		return "HistoryStudent [historyMarks=" + historyMarks + ", civilMarks=" + civilMarks + ", percentage="
				+ percentage + ", percentageCalculated=" + percentageCalculated + ", studentName=" + studentName
				+ ", studentClass=" + studentClass + "]";
	}
	
	
}


//   - Implement `getPercentage()` to calculate and return the percentage of marks.
//     Notify the thread waiting to check promotion after calculation.
//   - A synchronized method `isPromoted()`-> that checks if the student has failed in two or more subjects (marks below 40) or its's total percentage    	is less than 	60 % then it's not promoted to next batch otherwise it's promoted to next batch.
