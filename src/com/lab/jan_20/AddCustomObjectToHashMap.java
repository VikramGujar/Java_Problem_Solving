package com.lab.jan_20;

import java.util.HashMap;

public class AddCustomObjectToHashMap {

	public static void main(String[] args) 
	{
	
		HashMap<Student, Integer> stdMap = new HashMap<Student, Integer>();
		stdMap.put(new Student(1, "Vikram", 21), 1);
		stdMap.put(new Student(1, "Vikram", 21), 1);
		stdMap.put(new Student(2, "Vikram", 22), 1);
		
		System.out.println(stdMap);

	}

}
