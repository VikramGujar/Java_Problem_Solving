package com.lab.dec_31;

import java.util.ArrayList;
import java.util.ListIterator;

public class Test10 
{
		public static void main(String[] args) 
		{
			ArrayList al = new ArrayList<>();
			
			// We are adding objects to arraylist
			al.add(50);
			al.add(25);
			
			// ListIterator object holding al reference
			ListIterator li = al.listIterator();
			
			// will print all element of li 
			while(li.hasNext())
				System.out.println(li.next());
			
			//flase
			li.add(22);
			
			System.out.println(li.hasNext());
		}
	}