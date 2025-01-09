package com.lab.jan_08;

import java.util.SortedMap;
import java.util.TreeMap;

public class Test12 
{
	public static void main(String[] args) 
	{
		SortedMap smap = new TreeMap();
		smap.put(101,"nit");
		smap.put(105,"Technology");
		smap.put(103,"Naresh");
		//{101=nit, 103=Naresh, 105=Technology}
		System.out.println(smap);
	}
}
