package com.lab.dec_31;

import java.util.ArrayList;
import java.util.Iterator;

public class Test3
{	
		public static void main(String[] args) 
		{
			// ArrayList object created
			ArrayList<String> al = new ArrayList<>();
			
			// Adding elements to list
			al.add("25");		// [25]
			al.add("Naresh");	// [25, Naresh]
			al.add("A");		// [25, Naresh, A]
			al.add("37");		// [25, Naresh, A, 37]
			
			// iterator method of Iterator interface
			Iterator<String> it = al.iterator();
			
			// hasNext method of Iterator interface will check 
			// weather the next index is having element or not
			// [ 25, Naresh, A , 37 ]
			while(it.hasNext())
				// Here we are printing [it] object
				//cursor will not move program will be in infinite loop
				System.out.print(it+", ");
		}
	}