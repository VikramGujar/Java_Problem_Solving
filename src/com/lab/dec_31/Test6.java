package com.lab.dec_31;

import java.util.ArrayList;

public class Test6 
{
		public static void main(String[] args) 
		{
			// String type
			ArrayList<String> al = new ArrayList<>();
			
			al.add("google");
			al.add("Naresh");
			al.add("Information");
			al.add("Technology");
			
			for(int i=0;i<al.size();i++) 
			{
				// substring will only print string 0-5 index
				// [ google, Naresh, Inform, Techno]
				System.out.print(al.get(i).substring(0,6)+", ");
			}
		}
	}