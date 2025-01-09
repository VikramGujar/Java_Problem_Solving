package com.lab.jan_08;

import java.util.Set;
import java.util.TreeSet;

public class Test2 
{
	public static void main(String[] args) 
	{
		
		Set<String> tree = new TreeSet<>();
		tree.add("25");
		tree.add("Naresh");
		tree.add("A");
		tree.add("37");
		// [ 25 37 A Naresh ]
		for(String str: tree)
			System.out.print(str+" ");
	}
}
