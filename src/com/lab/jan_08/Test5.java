package com.lab.jan_08;

import java.util.Set;
import java.util.TreeSet;

public class Test5 
{
	public static void main(String[] args) 
	{
		Set<String> tree = new TreeSet<>();
		tree.add("google");
		tree.add("Naresh");
		tree.add("Information");
		tree.add("Technology");		
		for(String str: tree) 
		{
			// set contains Naresh it will return true
			// all element of tree set will print
			if(tree.contains("Naresh"))
				System.out.print(str+" ");
		}
	}
}
