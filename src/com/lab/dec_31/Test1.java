package com.lab.dec_31;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test1 {
		public static void main(String[] args) 
		{
			// asList method will convert the array into List
			List<String> list = Arrays.asList("goolge", "nareshIT","NareshIT","progress");
			
			//This line will reverse the array in alphabetical order [ z-a ] 
			Collections.reverse(list);
			
			// For each loop will print list stored in list object
			for(String str: list)
				System.out.print(str+", ");
		}
	}