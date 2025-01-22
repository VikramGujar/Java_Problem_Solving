package com.lab.jan_22;

import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class NumbersInRevers 
{
	
	public static void main(String[] args) 
	{
		TreeMap<Integer, String> numberMap = new  TreeMap<Integer, String>
		((n1,n2)-> n2.compareTo(n1));
		
		numberMap.put(10, "Ten");
		numberMap.put(5, "Five");
		numberMap.put(20, "Twenty");
		numberMap.put(1, "One");
		numberMap.put(15, "Fifteen");
		numberMap.put(-1, "Minus One");
		numberMap.put(-5, "Minus Five");
		numberMap.put(0, "Zero");
		numberMap.put(-10, "Minus Ten");
		numberMap.put(5, "Five");
		
		Set<Entry<Integer, String>> entrySet = numberMap.entrySet();
		
		for(Entry<Integer, String> ent : entrySet)
		{
			System.out.println(ent.getKey()+"-->"+ent.getValue());
		}
		
		
		
		

	}

}
