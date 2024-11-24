package com.vikram.interface_programs;

public class FullTimeEmployee implements Employee {
	
	private int employeeId ;    	
	private String employeeName ;  
	private double monthlySalary ;	
	private double benefits ;	
	
	

	public FullTimeEmployee(int employeeId, String employeeName, double monthlySalary, double benefits) {
		super();
		if(monthlySalary <0)
		{
			System.err.println("Error: Monthly salary cannot be negative.");
			System.exit(0);
		}else {
			this.employeeId = employeeId;
			this.employeeName = employeeName;
			this.monthlySalary = monthlySalary;
			this.benefits = benefits;
		}
		
	}

	
	@Override
	public double calculateSalary() {
		
		
		return this.monthlySalary+this.benefits;
	}

	@Override
	public void generatePayroll() {
		
		System.out.println("Employee Id : "+this.employeeId+"\nEmployee name : "+this.employeeName+"\nEmployee Salary : "+calculateSalary());
		
	}

}
