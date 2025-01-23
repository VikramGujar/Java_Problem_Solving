package com.assignment.navigable_map;

import java.util.NavigableMap;
import java.util.TreeMap;

public class CeilingEntryDemo 
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
		
		// If key not present it will return key greater than the given key
		System.out.println("0 non present key :"+std.ceilingEntry(0));
		
		// It gives you current entry Key=value
		System.out.println("For Key 3 :"+std.ceilingEntry(3));
		
		
		

	}

}
