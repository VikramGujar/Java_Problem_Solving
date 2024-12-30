package com.lab.dec_30;
import java.util.ArrayList;
import java.util.List;

public class Test7 
{
	public static void main(String[] args)
	{
		List<String> list = new ArrayList<String>();
		
		list.add("Patna");			// ["Patna"]
		list.add(0, "New York");	// ["New York", "Patna"]
		list.add("Mumbai");			// ["New York", "Patna", "Mumbai"]
		list.add(2, "Sydney");		// ["New York", "Patna", "Sydney, "Mumbai"]
		
		//This line will print the list
		// ["New York", "Patna", "Sydney, "Mumbai"]
		System.out.println(list);
	}
}

