package com.lab.jan_08;

import java.util.HashSet;

public class Test9 
{
	public static void main(String[] args) 
	{
		HashSet set = new HashSet<>();
		set.add(new StringBuffer("nit"));	
		set.add(new StringBuffer("nit"));
		// Two different object created internally 
		System.out.println(set); // [nit, nit]
		System.out.println(set.size()); // 2
	}
}