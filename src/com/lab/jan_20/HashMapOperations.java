package com.lab.jan_20;

import java.util.HashMap;

public class HashMapOperations 
{

	public static void main(String[] args) 
	{
		HashMap<String, Integer> indCric = new HashMap<String, Integer>();
		HashMap<String, Integer> ausCric = new HashMap<String, Integer>();
		
		indCric.put("Virat", 1);
		indCric.put("Dhoni", 2);
		indCric.put("Rohit", 3);
		
		ausCric.put("Maxwell", 1);
		ausCric.put("Commins", 2);
		ausCric.put("Stark", 3);
		
		indCric.putAll(ausCric);
		System.out.println(indCric);
		
		System.out.println("\n After putIfUpsent");
		indCric.putIfAbsent("Virat", 18);
		indCric.putIfAbsent("Dhawan", 4);
		System.out.println(indCric);
		
		
		System.out.println("\n After Replace");
		indCric.replace("Virat", 18);
		System.out.println(indCric);
		
		System.out.println("\n After Remove");
		indCric.remove("Stark");
		indCric.remove("Commins");
		indCric.remove("Maxwell");
		System.out.println(indCric);

	}

}
/*

You are tasked with implementing a Java program 
that demonstrates various operations on HashMap 
such as merging two HashMap.
Create two HashMap<String, Integer> instances to store fruit names as keys and their quantities as values.
Merge the second HashMap into the first one using the putAll method.
Use the putIfAbsent method to add an entry to the HashMap only if the key is not already present.
Use the replace method to update the value for a specific key.
Use the remove method to delete an entry from the HashMap based on the key.

Example Output :
After merging fruitInventory2 into fruitInventory1:
{Apple=50, Banana=25, Orange=20, Mango=40}

After using putIfAbsent:
{Apple=50, Banana=25, Orange=20, Mango=40, Grapes=35}

After using replace:
{Apple=50, Banana=25, Orange=25, Mango=40, Grapes=35}

After using remove:
{Apple=50, Banana=25, Orange=25, Grapes=35}
*/