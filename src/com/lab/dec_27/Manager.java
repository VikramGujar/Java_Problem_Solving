package com.lab.dec_27;

public class Manager extends Employee 
{
	private ManagerType managerType;
	
	public Manager() 
	{
		super();
	}

	public Manager(String name, int employeeId, double salary, ManagerType managerType) 
	{
		super(name, employeeId, salary);
		this.managerType = managerType;
		setSalary(salary);
		
	}
	
	public ManagerType getManagerType() {
		return managerType;
	}

	public void setManagerType(ManagerType managerType) {
		this.managerType = managerType;
	}
	
	@Override
	public void setSalary(double salary) 
	{
		if(managerType.equals(ManagerType.HR))
		{
			super.setSalary(salary+10000);			
		}else if(managerType.equals(ManagerType.Sales))
		{
			super.setSalary(salary+5000);
		}
	}

	@Override
	public String toString() 
	{
		return "Manager [managerType=" + managerType + ", Name ="
				+ getName() + ", EmployeeId =" + getEmployeeId() + ", "
						+ "Salary =" + getSalary() + "]";
	}
	
	
	
	
	
}

