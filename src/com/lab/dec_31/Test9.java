package com.lab.dec_31;

import java.util.ArrayList;

public class Test9
{
		public static void main(String[] args) 
		{
			ArrayList al = new ArrayList<>();
			
			al.add(5);
			al.add("");
			al.add(10);
			
			// contains method will check weather the
			// element present of not
			System.out.println(al.contains(6));	 	// false
			System.out.println(al.contains(10)); 	// true
			System.out.println(al.contains(null));	// false
		}
	}