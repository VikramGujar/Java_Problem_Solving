package com.lab.jan_08;

import java.util.TreeSet;

public class Test10 
{
	public static void main(String[] args) 
	{
		// Object type TreeSet
		TreeSet tree = new TreeSet<>();
		tree.add("nit");
		tree.add("Naresh");
		// String campairTo Integer 
		// java.lang.ClassCastException
		tree.add(25); 
		System.out.println(tree.tailSet("a"));
	}
}
