package com.lab.jan_27;

import java.util.HashMap;

@SuppressWarnings("serial")
public class FilterableHashMap<K,V> extends HashMap<K, V>
{
	
	
	
	public FilterableHashMap() {
		super();
	}

	@Override
	public V put(K key, V value) 
	{
		if(!(key instanceof Integer && value instanceof String))
		{
			System.out.println("Entry failed!");
			return null;
		}else if(value.toString().length()<=10)
		{
			System.out.println("String should be less than 10 ");
		}
		
			
		return super.put(key, value);
	}
	
	public V getFiltered(K key)
	{
		if(!(key instanceof Integer))
		{
			System.out.println("Invalid key");
			return null;
		}
		return super.get(key);
	}
	
	
	
	
	

}
/*
Custom Filterable HashMap Implementation.
Implement a custom HashMap in Java, FilterableHashMap, 
that supports filtering entries based on specified criteria for keys and values. 
The FilterableHashMap should include methods to 
add entries (put) and retrieve entries (getFiltered) with custom filtering rules.
Custom FilterableHashMap Class:

Create a Java BLC class FilterableHashMap<K,V> that extends HashMap<K, V>, 
where K represents the key type and V represents the value type.

methods :
Override the put method to add entries 
to the map only if they meet specific criteria for keys and values.
Only add entries if the key is of type Integer and the value is of type String 
with a length of 10 characters or less.
Print a message indicating if an entry is rejected due to failing the criteria.


Implement a custom method getFiltered to retrieve values from the map 
based on specified key filtering criteria.
method name : getFiltered
modifiers : public 
parameter : K key
return type : V 
Retrieve values from the map only if the key is of type Integer.
Print a message if an invalid key type is used.

Create a ELC class Tester :
In main method : 
Create an instance of FilterableHashMap<Integer, String>
Call put method by providing key and value.
Retrieve the values by calling getFiltered method by passing key.
Display the map.

Test Cases:

Test Case 1:
Input: Add entries {1=One, 2=Two, 3=Three, 4=Fourteen}.
Expected Output: Print map contents {1=One, 2=Two, 3=Three} after filtering out 4=Fourteen.

Test Case 2:
Input: Retrieve value for key 2.
Expected Output: Print Two as the value associated with key 2.

Test Case 3:
Input: Retrieve value for key "abc".
Expected Output: Print Invalid key type: abc, null indicating an invalid key type.

Extra Case:
Input: Attempt to add an entry with key null or non-Integer type.
Expected Output: Entry is rejected with appropriate error message
*/