package com.lab.dec_29;

public class StudentTester 
{

	public static void main(String[] args) 
	{
		ScienceStudent Virat = new ScienceStudent(85, 60, 70, "Virat", "Scince Class");
		HistoryStudent Dhoni = new HistoryStudent(70, 55, "Dhoni", "History Class");
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				Virat.getPercentage();
				Virat.toString();
				
			}
		});
	
	
	Thread t2 = new Thread(new Runnable() {
		
		@Override
		public void run() {
			Dhoni.getPercentage();
		}
	});
	
	t1.start();
	t2.start();
}

}
/*

//4. Develop a "StudentTester" class:
// - Create instances of ScienceStudent and HistoryStudent.
// - Use separate threads for:
//   - Calculating the percentage for each student.
//   - Checking the promotion status for each student.
// - Ensure inter-thread communication using synchronized methods and wait-notify mechanism.
// - Display the total number of students after all threads have completed execution.
//
//Example:
//Input: 
//- Science Student: Virat, Class: 12th, Marks: [85, 40, 35]
//- History Student: Dhoni, Class: 11th, Marks: [70, 35]
//
//Output:
//- Science Student: Virat
//Percentage: 53%
//Promoted: No
//- History Student: Dhoni
//Percentage: 52%
//Promoted: Yes
//- Total Number of Students: 2
*/