package com.lab.dec_27;

public class Clerk extends Employee
{

	private int speed;
	private int accuracy;
	private int extraGiven;
	
	public Clerk() 
	{
		super();
	}
	
	public Clerk(String name, int employeeId, double salary, int speed, int accuracy) 
	{
		super(name, employeeId, salary);
		this.speed = speed;
		this.accuracy = accuracy;
	}

	public int getSpeed() 
	{
		return speed;
	}

	public void setSpeed(int speed) 
	{
		this.speed = speed;
		System.out.println(getName()+" speed updated to "+ this.speed);
		if(extraGiven<2)
		{
			this.setSalary(super.getSalary());
			extraGiven++;
		}
	}

	public int getAccuracy() 
	{
		return accuracy;
	}

	public void setAccuracy(int accuracy) 
	{
		this.accuracy = accuracy;
		if(extraGiven<2)
		{
			this.setSalary(super.getSalary());
			extraGiven++;
		}
	}
	
	public void setSalary(double salary) 
	{
		if(speed > 70 && accuracy > 80)
			super.setSalary(salary+1000);
		else 
			super.setSalary(salary);		
	} 
	
}

 