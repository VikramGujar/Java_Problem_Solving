package com.lab.dec_30;
import java.util.*;

public class Test4 
{
	public static void main(String args[]) 
	{
		Vector obj = new Vector(4,2);
		
		obj.addElement(new Integer(3));
		obj.addElement(new Integer(2));
		obj.addElement(new Integer(5));
		
		// here remove all will remove all elements from vector
		obj.removeAll(obj);
		
		// isEmpty method will check weather the vector is empty of not
		// true
		System.out.println(obj.isEmpty());
		
		// will print empty array 
		// [ ]
		System.out.println(obj);
	}
}



