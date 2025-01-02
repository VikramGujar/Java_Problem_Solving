package com.lab.jan_02;

public class TravelItineraryPlannerMain 
{

	public static void main(String[] args) 
	{
		Destination Paris = new Destination("Paris");
		Destination London = new Destination("London");
		
		ItineraryPlanner ip = new ItineraryPlanner();
		ip.addDestination(London);
		ip.addDestination(Paris);
		
		Activity ac1 = new Activity("Go to watch tower", 1);
		Activity ac2 = new Activity("Attempt Opera", 2);
		
		London.addActivitys(ac1);
		Paris.addActivitys(ac2);
		
		System.out.println(ac1.toString());
		System.out.println(ac2.toString());

	}

}
/*
TravelItineraryPlanner (Main Class):
Creates an instance of ItineraryPlanner.
Creates two Destination objects: "Paris" and "London".
Adds activities to each destination.
Adds these destinations to the itinerary planner.
Displays the itinerary by listing destinations and their respective activities.
*/