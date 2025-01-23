package com.assignment.navigable_map;

import java.util.NavigableMap;
import java.util.TreeMap;

public class CeilingKeyDemo 
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
		
		//Gives key equals to the give key
		System.out.println("For 3 Kay :"+std.ceilingKey(3));
		
		//If key does not exist return Key greater than given key
		System.out.println("For 0 Kay :"+std.ceilingKey(0));
		
		//If equal and greater than the given key 
		//both not available then it will return null
		System.out.println("For 8 Kay :"+std.ceilingKey(8));

	}

}
