package com.lab.dec_31;

import java.util.ArrayList;

public class Test12 
{
	public static void main(String[] args)
	{
		// String type ArrayList
		ArrayList<String> list = new ArrayList<String>();
		
		list.add(null);		// null
		list.add(0, "A");	// A null
		list.add(null);		// A null null
		list.add(2, "B");	// A null B null
		list.add("20");		// A null B null 20
		list.add(1, "C");	// A C null B null 20
		
//		will print [ A, C, null, B, null, 20 ]
		System.out.println(list);
	}
}