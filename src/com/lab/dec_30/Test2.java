package com.lab.dec_30;

import java.util.*;

public class Test2 
{
	public static void main(String args[]) 
	{
		//This is calling constructor Vector(int initialCapacity, int capacityIncrement)
		Vector obj = new Vector(4,2);
		// InitialCapacity = 4
		// CapacityIncreament = 2
		
		// Here we are adding elements to vector
		obj.addElement(new Integer(3));
		obj.addElement(new Integer(2));
		obj.addElement(new Integer(5));
		
		// Capacity will be printed [ 4 ]
		System.out.println(obj.capacity());
	}
}
