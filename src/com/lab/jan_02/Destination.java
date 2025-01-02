package com.lab.jan_02;

import java.util.ArrayList;

public class Destination 
{

	private String name;
	private ArrayList<Activity> activities;
	
	
	public Destination(String name) 
	{
		super();
		this.name = name;
		this.activities = new ArrayList<Activity>();
	}
	
	public void addActivitys(Activity a)
	{
		activities.add(a);
	}

	@Override
	public String toString() {
		return "Destination [name=" + name + ", activities=" + activities + "]";
	}
	
	
	
}
/*
Destination:
Represents a destination with a name and a list of activities.
Has a constructor to set the destination's name and initialize an empty list of activities.
Provides methods to add activities to the destination and retrieve the list of activities.
Overrides the toString() method to provide a string representation of a destination.
*/