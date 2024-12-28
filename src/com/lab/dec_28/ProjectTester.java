package com.lab.dec_28;

public class ProjectTester {

	public static void main(String[] args) 
	{
		DevelopmentProject dp = new DevelopmentProject(90, 80, 95, false, "Project A", "Vikram");
		ResearchProject rp = new ResearchProject(85, 75, false, "Project B", "Harun");
		
		Thread t1 = new Thread(new Runnable() 
		{
			
			@Override
			public void run() {
				System.out.println("Project name : "+dp.projectName);
				System.out.println("Project Manager : "+dp.projectManager);
				System.out.println("Successful rate : "+dp.getSuccessRate()); 
				System.out.println("Successful : "+dp.isSuccessful()); 
				
			}
		});
		
		Thread t2 = new Thread(new Runnable() 
		{
			
			@Override
			public void run() {
				System.out.println("\nProject name : "+rp.projectName);
				System.out.println("Project Manager : "+rp.projectManager);
				System.out.println("Successful rate : "+rp.getSuccessRate()); 
				System.out.println("Successful : "+rp.isSuccessful()); 
				
			}
		});
		
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		
		try {
			
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
/*

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


Develop a ProjectTester class:

Create instances of DevelopmentProject and ResearchProject.

Use separate threads for:
Calculating the success rate for each project.
Checking the success status for each project.

Ensure inter-thread communication using synchronized methods and wait-notify mechanism.
Display the total number of projects after all threads have completed execution.

*/