package com.assignment.navigable_map;

import java.util.NavigableMap;
import java.util.TreeMap;

public class LowerKeyDemo {

	public static void main(String[] args) {
		NavigableMap<Integer, String> std = new TreeMap<Integer, String>();
		std.put(1, "Vikram");
		std.put(4, "Sai");
		std.put(5, "Harun");
		std.put(2, "Bhagywant");
		std.put(3, "Manoj");
		
		System.out.println(std+"\n");
		
		//Returns Lesser key to the given key
		System.out.println("For key 4 :"+std.lowerKey(4));
				
		
		//If Lesser key not exist
		//Return null
		System.out.println("For key 1 :"+std.lowerEntry(1));
		
		System.out.println("For key 0 :"+std.lowerEntry(0));

	}

}
