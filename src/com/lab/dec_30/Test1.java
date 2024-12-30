package com.lab.dec_30;

import java.util.*;
class Test1
{
	public static void main(String args[])
	{
		// here we are creating vector class object
		// constructor is taking [ int initialCapacity, int capacityIncrement ]
		Vector obj = new Vector(4,2); 
		
		// This type of constructor is removed [ Deprecated ] from integer class since JAVA-9
		obj.addElement(new Integer(3));
		obj.addElement(new Integer(2));
		obj.addElement(new Integer(5));
		
		// This line will print element which is at 1 index [ 2 ]
		// Vector is internally array thats why it adds elements as per indexes 
		System.out.println(obj.elementAt(1));
	}
}
