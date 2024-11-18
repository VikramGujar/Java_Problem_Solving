package com.vikram.test;

public class EmployeeManagerSystem {

	public static void main(String[] args) {
		
		Employee emp = new Employee(1,"Vikram",80000);
		
		Manager mg = new Manager(1, "Vikram",80000,"Devolpment");
		
		System.out.println(emp);
		System.out.println(mg);

	}

}
