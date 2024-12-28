package com.lab.dec_28;

public abstract class Project 
{

	protected String projectName;
	protected String projectManager;
	protected static int totalNoOfProjects;
	
	
	
	public Project() 
	{
		super();
	}
	
	

	public Project(String projectName, String projectManager) 
	{
		super();
		this.projectName = projectName;
		this.projectManager = projectManager;
	}



	public synchronized static void incrementTotalNoOfProjects()
	{
		totalNoOfProjects++;
	}
	
	public abstract int getSuccessRate();
	
	public static int getTotalNoOfProjects()
	{
		return totalNoOfProjects;
	}
	
}


/*

Create an abstract class Project:

Instance Variables:
projectName: protected String
projectManager: protected String
totalNoOfProjects: protected static int

Methods:
A synchronized static method incrementTotalNoOfProjects() to increment the total number of projects.
An abstract method getSuccessRate() with a return type of int.
A static method getTotalNoOfProjects() to return the total number of projects.

Two constructors: a no-argument constructor and a parameterized constructor to initialize project name and manager, incrementing the total number of projects.

Create a class ResearchProject inheriting from Project:

Instance Variables:

innovationScore: private int
resourceUtilization: private int
successRate: private int (calculated by getSuccessRate)
rateCalculated: private boolean (default false)

Methods:

Implement getSuccessRate() to calculate and return the success rate. Notify the thread waiting to check success status after calculation.
A synchronized method isSuccessful() to determine if the project is successful. Wait for rate calculation if necessary.

Develop a ProjectTester class:

Create instances of DevelopmentProject and ResearchProject.

Use separate threads for:
Calculating the success rate for each project.
Checking the success status for each project.

Ensure inter-thread communication using synchronized methods and wait-notify mechanism.
Display the total number of projects after all threads have completed execution.


Sample Input:

Development Project: Project A, Manager: John, Scores: [90, 80, 95]
Research Project: Project B, Manager: Sarah, Scores: [85, 75]

Sample Output:

Development Project: Project A
Success Rate: 88
Successful: Yes

Research Project: Project B
Success Rate: 80
Successful: Yes

Total Number of Projects: 2


*/