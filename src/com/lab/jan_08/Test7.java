package com.lab.jan_08;

import java.util.HashSet;

public class Test7 
{
	public static void main(String[] args) 
	{
		HashSet hash = new HashSet<>();
		hash.add("nit");
		hash.add("NIT");
		System.out.println(hash);			// [ nit, NIT ]
		System.out.println(hash.size());	// 2
	}
}