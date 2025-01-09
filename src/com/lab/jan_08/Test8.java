package com.lab.jan_08;

import java.util.HashSet;

public class Test8 
{
	public static void main(String[] args) 
	{
		HashSet hash = new HashSet<>();
		hash.add("nit");
		hash.add("nit");	// duplicate not allowed
		System.out.println(hash);	// [ nit ]
		System.out.println(hash.size());	// 1
	}
}
