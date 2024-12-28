package com.lab.dec_28;

public class DevelopmentProject extends Project
{
	
		private int requirementsMet;
		private int bugsResolved;
		private int onTimeDelivery;
		private int successRate;
		private boolean rateCalculated; 

	
	public DevelopmentProject() {
			super();
			// TODO Auto-generated constructor stub
		}

		public DevelopmentProject(int requirementsMet, int bugsResolved, int onTimeDelivery,  boolean rateCalculated, String projectName, String projectManager) {
			super(projectName, projectManager);
			this.requirementsMet = requirementsMet;
			this.bugsResolved = bugsResolved;
			this.onTimeDelivery = onTimeDelivery;
			this.rateCalculated = rateCalculated;
			incrementTotalNoOfProjects();
			
		}

	@Override
	public int getSuccessRate() 
	{
		successRate =  (requirementsMet + bugsResolved + onTimeDelivery)/3;
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


Create a class DevelopmentProject inheriting from Project:

Instance Variables:
requirementsMet: private int
bugsResolved: private int
onTimeDelivery: private int
successRate: private int (calculated by getSuccessRate)
rateCalculated: private boolean (default false)

Methods:

Implement getSuccessRate() to calculate and return the success rate. 
Notify the thread waiting to check success status after calculation.
A synchronized method isSuccessful() to determine if the project is successful. 
Wait for rate calculation if necessary.

*/
