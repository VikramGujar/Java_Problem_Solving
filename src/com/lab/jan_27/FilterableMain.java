package com.lab.jan_27;

public class FilterableMain 
{

	public static void main(String[] args) 
	{
		FilterableHashMap<Integer, String> fMap = new FilterableHashMap<Integer, String>();
		fMap.put(1, "Onejsfhaursearugf");
		fMap.put(2, "Two");
		
		fMap.forEach((k,v)->System.out.println("Key : "+k+" Value : "+v+""));
		System.out.println();
		
		System.out.println("For Key 2 Value is "+fMap.getFiltered(2));
		
	}
}
