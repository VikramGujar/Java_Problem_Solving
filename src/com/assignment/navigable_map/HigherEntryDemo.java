package com.assignment.navigable_map;

import java.util.NavigableMap;
import java.util.TreeMap;

public class HigherEntryDemo {

	public static void main(String[] args) 
	{
		
		NavigableMap<Integer, String> std = new TreeMap<Integer, String>();
		std.put(1, "Vikram");
		std.put(4, "Sai");
		std.put(5, "Harun");
		std.put(2, "Bhagywant");
		std.put(3, "Manoj");
		
		System.out.println(std+"\n");
		
		//Returns given key=value pair greater to the given key
		System.out.println("For key 4 :"+std.higherEntry(4));
				
		
		//If greater key not exist
		//Return null
		System.out.println("For key 5 :"+std.higherEntry(5));
	
		System.out.println("For key 8 :"+std.higherEntry(8));

	}

}
