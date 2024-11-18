package com.vikram.test;

public class Employee {

	int employeeId;
    String employeeName;
    double employeeSalary;

    public Employee(int employeeId, String employeeName, double employeeSalary){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }
    
    public double calculateBonus(double employeeSalary) {
    	return 0.1*employeeSalary;
    }

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + "]";
	}
    
    
}
