package com.lab.dec_31;

import java.util.ArrayList;

public class Test8 
{
		public static void main(String[] args) 
		{
			ArrayList<Integer> al = new ArrayList<Integer>();
			
			for(int i=5;i<10;i++) 
			{
				al.add(i);
			}
			// will remove 4th index
			al.remove(4);
			
			// At index 4 we have 9 it will be removed
			// 5, 6, 7, 8,  ->[9
			for(int str: al)
				// 5, 6, 7, 8, 
				System.out.print(str+", ");
		}
	}