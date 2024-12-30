package com.lab.dec_30;

import java.util.*;
public class Test5 
{
	public static void main(String args[]) 
	{
		// Array of lenght 5 will be created
		int array[] = new int [5];
		
		
		// array will be filled with 5-1 values 
		// [ 5, 4, 3, 2, 1 ]
		for (int i = 5; i > 0; i--)
			array[5-i] = i;
		
		
		/*
		 public static void fill(int[] a, int fromIndex, int toIndex, int val) 
		 {
        	rangeCheck(a.length, fromIndex, toIndex);
        	for (int i = fromIndex; i < toIndex; i++)
            a[i] = val;
    	 }
		 */
		
		// This fill method is taking parameters
		// 1. Array[]	=> array
		// 2. fromIndex => 1
		// 3. toIndex   => 4
		// 4. value		=> 8
		Arrays.fill(array, 1, 4, 8);
		// The above method will fill array with value 8 
		// from index 1 to index 4 that is [1], [2], [3]
		// array [ 5, 8, 8, 8, 1 ]
		
		
		for (int i = 0; i < 5 ; i++)
			System.out.print(array[i]+" ");
}
}
