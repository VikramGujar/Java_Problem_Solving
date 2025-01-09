package com.lab.jan_08;

import java.util.HashMap;

public class Test6 
{
	public static void main(String[] args) 
	{
		HashMap hash = new HashMap<>();
		// public V put(K key, V value)
		hash.put("nit", 500);
		hash.put("info", 644);
		hash.put("tech", "google");
		System.out.println(hash.get("tech")); 	// key = tech , value = google
		System.out.println(hash.get("google"));	// key = google, value = not exist [null]
		
		// getOrDefault method will check weather the key is having a
		// value if not then it will return default value given in parameter
		// as value of that key
		// But this will be temporary not stores in map
		System.out.println(hash.getOrDefault("google", "Technology"));
		
		System.out.println(hash.get("info")); // key = info , value = 644
		
		hash.forEach((a,b)->System.out.println(a+" "+b));
	}
}
