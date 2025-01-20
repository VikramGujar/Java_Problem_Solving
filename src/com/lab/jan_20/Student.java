package com.lab.jan_20;

import java.util.Objects;

public record Student(Integer id, String name, Integer age) 
{

	@Override
	public final int hashCode() 
	{
		return Objects.hash(id,name,age);
	}
	
	@Override
	public final boolean equals(Object obj) {
		Student std =(Student) obj;
		if(std==null)
		{
			System.out.println("Can not campaire null");
			return false;
		}
		else if(std == this)
			return true;
		else if(std.id().equals(this.id()) && 
				std.name().equals(this.name()) &&
				std.age().equals(this.age()))
			return true;
		else 
			return false;
		
		
	}
}
