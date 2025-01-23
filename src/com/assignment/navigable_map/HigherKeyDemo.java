package com.assignment.navigable_map;

import java.util.NavigableMap;
import java.util.TreeMap;

public class HigherKeyDemo 
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
		
		//Returns greater key to the given key
		System.out.println("For key 4 :"+std.higherKey(4));
				
		
		//If greater key not exist
		//Return null
		System.out.println("For key 5 :"+std.higherKey(5));
	
		System.out.println("For key 8 :"+std.higherKey(8));

	}

}
