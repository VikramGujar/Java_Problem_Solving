package com.assignment.navigable_map;

import java.util.NavigableMap;
import java.util.TreeMap;

public class FloorKeyDemo 
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
		
		//Returns given key equals to the given Key
		System.out.println("For key 4 :"+std.floorKey(4));
		
		//If equal key does not exist
		//returns the key less than that key 
		System.out.println("For key 8 :"+std.floorKey(8));
		
		//If both equal and less than not exist 
		//return null
		System.out.println("For key 0 :"+std.floorKey(0));

	}

}
