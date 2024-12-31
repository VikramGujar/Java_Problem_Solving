package com.lab.dec_31;

import java.util.ArrayList;

public class Test4 
{
		public static void main(String[] args) 
		{
			ArrayList<String> al = new ArrayList<>();
			
			al.add("25");
			al.add("Naresh");
			al.add("A");
			al.add("37");
			
			// remove method will try to remove 4th index from ArrayList 
			al.remove(4);
			// java.lang.IndexOutOfBoundsException
			
			for(String str: al)
				System.out.print(str+" ");
		}
	}