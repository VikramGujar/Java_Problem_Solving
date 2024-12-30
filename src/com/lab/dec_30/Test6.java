package com.lab.dec_30;

import java.util.*;
public class Test6  
{
	public static void main(String args[])
	{
		// Creating objects for ArrayList
		ArrayList obj1 = new ArrayList();
		ArrayList obj2 = new ArrayList();
		
		// Adding objects to ArrayList
		obj1.add("A");
		obj1.add("B");
		obj2.add("A");
		
		// Adding "B" at index 1
		obj2.add(1, "B");
		
		// Will check that the obj1 is equals to obj2 or not
		// True
		System.out.println(obj1.equals(obj2));
	}
}



