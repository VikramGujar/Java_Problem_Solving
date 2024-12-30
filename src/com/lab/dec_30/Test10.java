package com.lab.dec_30;

import java.util.ArrayList;
public class Test10 
{
	public static void main(String[] args)
	{
 
		ArrayList<String> list = new ArrayList<String>();
 
		list.add(null);		// [null]
		list.add(0, "A");	// [A, null]
		list.add(2, "B");	// [A, null, B]
		list.add(1, "C");	// [A, C, null, B]
 
		// Will print the list
		// [A, C, null, B]
		System.out.println(list);
	}
}

