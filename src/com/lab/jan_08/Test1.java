package com.lab.jan_08;

import java.util.TreeSet;

public class Test1 
{
	public static void main(String[] args) 
	{
		// TreeSet object of type string
		TreeSet<String> tree = new TreeSet<>();
		tree.add("25");
		tree.add("Naresh");
		tree.add("A");
		tree.add("37");
		// [ 25 37 A Naresh ]
		for(String str: tree)
			System.out.print(str+" ");
	}
}