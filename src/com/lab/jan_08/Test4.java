package com.lab.jan_08;

import java.util.Set;
import java.util.TreeSet;

public class Test4 
{
	public static void main(String[] args) 
	{
		Set<String> tree = new TreeSet<>();
		tree.add("google");
		tree.add("Naresh");
		tree.add("Information");
		tree.add("Technology");
		for(int i=2;i<tree.size();i++) 
		{
			// remove method takes object as a parameter 
			// we are passing int i
			// java.lang.ClassCastException will occur 
			System.out.print(tree.remove(i));
		}
	}
}
