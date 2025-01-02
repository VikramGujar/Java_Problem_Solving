package com.lab.jan_02;

import java.util.ArrayList;

public class ItineraryPlanner 
{

	ArrayList<Destination> destinations;

	public ItineraryPlanner() 
	{
		super();
		this.destinations = new ArrayList<Destination>();
	}
	
	public void addDestination(Destination d)
	{
		destinations.add(d);
	}
	
}
/*

ItineraryPlanner:
Manages a list of destinations.
Contains methods to add destinations and retrieve the list of destinations.
*/