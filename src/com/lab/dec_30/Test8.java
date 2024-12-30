package com.lab.dec_30;

import java.util.ArrayList;
import java.util.List;

public class Test8 
{
	public static void main(String[] args)
	{
		// Creating ArrayList Object
		List<String> list = new ArrayList<String>();
		
		
		list.add("Orange");		// list ["Orange"]
		list.add(0, "Banana");	// list ["Banana", "Orange"]
 
		//New ArrayList object created i.e arList
		ArrayList<String> arList = new ArrayList<>();
		
		arList.add("Apple");	// arList ["Apple"]
		list.add("Grapes");		// list ["Banana", "Orange", "Grapes"]
		
		// All elements of arList will be append to list
		// list ["Banana", "Orange", "Grapes"] + arList ["Apple"]
		list.addAll(3, arList);	// list ["Banana", "Orange", "Grapes" ,"Apple"]
		
		// ["Banana", "Orange", "Grapes" ,"Apple"]
		System.out.println(list);
	}
}

