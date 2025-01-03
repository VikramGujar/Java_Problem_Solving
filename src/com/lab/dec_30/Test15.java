package com.lab.dec_30;

import java.util.ArrayList;
public class Test15 
{
	public static void main(String[] args)
	{
		// ArrayList of Stringer type
		ArrayList<String> list = new ArrayList<>();
		
		/*
		 * String type ArrayList can't hold Integer data
		list.add(12);
		list.add(16);
		list.add(34);
		list.add(78);
		*/
		
		list.remove(Integer.valueOf(16));
		
		System.out.println(list);
 }
}



