package com.vikram.test;

public class Manager extends Employee {
	
	String departmentName;

	public Manager(int employeeId, String employeeName, double employeeSalary, String departmentName) {
		super(employeeId, employeeName, employeeSalary);
		this.departmentName = departmentName;
	}

	@Override
	public double calculateBonus(double employeeSalary) {
		// TODO Auto-generated method stub
		return super.calculateBonus(employeeSalary);
	}

	@Override
	public String toString() {
		return "Manager [departmentName=" + departmentName + "]";
	}
	
	

}
