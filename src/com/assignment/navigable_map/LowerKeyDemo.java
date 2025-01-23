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
		
		System.out.println("For key 4 :"+std.floorEntry(4));
		System.out.println("For key 4 :"+std.floorEntry(4));
		System.out.println("For key 4 :"+std.floorEntry(4));

	}

}
