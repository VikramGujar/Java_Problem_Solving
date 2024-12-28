package com.lab.dec_28;

public class ResearchProject extends Project
{
	private int innovationScore;
	private int resourceUtilization;
	private int successRate;
	private boolean rateCalculated;


	public ResearchProject() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ResearchProject(int innovationScore, int resourceUtilization, boolean rateCalculated, String projectName, String projectManager) 
	{
		super(projectName, projectManager);
		this.innovationScore = innovationScore;
		this.resourceUtilization = resourceUtilization;
		this.rateCalculated = rateCalculated;
		incrementTotalNoOfProjects();
		
	}

	@Override
	public int getSuccessRate() 
	{
		successRate = (innovationScore + resourceUtilization)/2;
		rateCalculated = true;
		return successRate;
	}
	
	public synchronized boolean isSuccessful()
	{
		while(!rateCalculated)
		{
			
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(getSuccessRate()>50)
			return true;
		else
			return false;
	}

}
/*

Create a class ResearchProject inheriting from Project:

Instance Variables:

innovationScore: private int
resourceUtilization: private int
successRate: private int (calculated by getSuccessRate)
rateCalculated: private boolean (default false)

Methods:

Implement getSuccessRate() to calculate and return the success rate. 
Notify the thread waiting to check success status after calculation.
A synchronized method isSuccessful() to determine if the project is successful. 
Wait for rate calculation if necessary.


*/