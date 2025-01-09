package com.lab.jan_08;

import java.util.TreeSet;

public class Test11 
{
	public static void main(String[] args) 
	{
		TreeSet tree = new TreeSet<>();
		tree.add("nit");
		tree.add("Naresh");
		tree.add("Technology");
		// After sorting : [ Naresh Technology nit ]
		
		//tailSet will check [ elements >= a ]
		// which is [ nit ]
		System.out.println(tree.tailSet("a"));
	}
}