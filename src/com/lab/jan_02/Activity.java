package com.lab.jan_02;

public class Activity 
{

	private String name;
	private int schedule;
	
	public Activity(String name, int schedule) {
		super();
		this.name = name;
		this.schedule = schedule;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSchedule() {
		return schedule;
	}

	public void setSchedule(int schedule) {
		this.schedule = schedule;
	}

	@Override
	public String toString() {
		return "Activity [name=" + name + ", schedule=" + schedule + "]";
	}
	
	
	
	
}
/*
Program-2
Travel Itinerary Planner:
Build a travel itinerary planner that organizes destinations, 
activities, and schedules for travelers using collections.

Activity:
Represents an activity with a name and schedule.
Contains a constructor to initialize the activity's details and getters to access these details.
Overrides the toString() method to provide a string representation of an activity.

Destination:
Represents a destination with a name and a list of activities.
Has a constructor to set the destination's name and initialize an empty list of activities.
Provides methods to add activities to the destination and retrieve the list of activities.
Overrides the toString() method to provide a string representation of a destination.

ItineraryPlanner:
Manages a list of destinations.
Contains methods to add destinations and retrieve the list of destinations.

TravelItineraryPlanner (Main Class):
Creates an instance of ItineraryPlanner.
Creates two Destination objects: "Paris" and "London".
Adds activities to each destination.
Adds these destinations to the itinerary planner.
Displays the itinerary by listing destinations and their respective activities.
*/