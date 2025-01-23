package com.assignment.navigable_map;

import java.util.NavigableMap;
import java.util.TreeMap;

public class FloorEntryDemo 
{

	public static void main(String[] args) 
	{
		
		NavigableMap<Integer, String> std = new TreeMap<Integer, String>();
		std.put(1, "Vikram");
		std.put(4, "Sai");
		std.put(5, "Harun");
		std.put(2, "Bhagywant");
		std.put(3, "Manoj");
		
		System.out.println(std+"\n");
		
		//Returns given key equals Key=value pair
		System.out.println("For key 4 :"+std.floorEntry(4));
		
		//If equal key does not exist
		//returns less than key  key=value pair
		System.out.println("For key 8 :"+std.floorEntry(8));
		
		//If both equal and less than not exist 
		//return null
		System.out.println("For key 0 :"+std.floorEntry(0));

	}

}
