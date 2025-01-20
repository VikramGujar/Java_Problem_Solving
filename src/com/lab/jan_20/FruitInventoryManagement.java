package com.lab.jan_20;


import java.util.Map;
import java.util.WeakHashMap;

public class FruitInventoryManagement 
{
	public static void main(String[] args) 
	{
		Map<String, Integer> fruits = new WeakHashMap<String, Integer>();
		fruits.put("Apple", 3);
		fruits.put("Orange", 4);
		fruits.put("Banana", 6);
		fruits.put("Pipneappple", 9);
		fruits.put("Cherry", 2);
		
		int qty = fruits.size();
		System.out.println("Total number of entries: "+qty);
		
		System.out.println(fruits.isEmpty()?"Map is Empty":"Map is not empty");
		
		String s1= "Apple";
		System.out.println(fruits.get(s1));
		
		System.out.println(fruits.containsKey(s1)?"Fruit "+s1+" is present in map":"Fruit "+s1+" is not present in map");
		
		
		int n = 1;
		System.out.println(fruits.containsValue(n)?"Quantity "+n+" is present in map":"Quantity "+n+" is not present in map");
		
		
		
		
	}
}

/*
 
 You are tasked with implementing a simple Java program that manages a collection of fruits and their quantities using a HashMap. 
Create a ELC class FruitInventoryManagement :
Add fruits and their quantities to the HashMap.
Display the total number of entries in the HashMap.
Check if the HashMap is empty.
Retrieve and print the quantity of a specific fruit.
Check if a specific fruit exists in the HashMap.
Check if a specific quantity exists in the HashMap.

Sample Output :
Added Apple: 50
Added Banana: 30
Added Orange: 20
Total number of entries: 3
HashMap is not empty.

Quantity for Apple: 50
Quantity for Banana: 30

Orange exists in the records.
Mango does not exist in the records.

Quantity 20 exists in the records.
Quantity 100 does not exist in the records.

*/
