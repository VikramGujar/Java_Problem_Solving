package com.lab.dec_30;

import java.util.ArrayList;
public class Test9 
{
	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<String>();
 
		// null added to 0th index
		list.add(null);		// [null]
		
		list.add(0, "A");	// [null, "A"]
		
		// Exception will occur
		// i.e  [ java.lang.IndexOutOfBoundsException ]
		list.add(3, "B");	// We can not insert element at 3 without inserting at 2
		list.add(1, "C");
 
		System.out.println(list);
	}
}
