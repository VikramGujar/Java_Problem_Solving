package com.lab.dec_31;

import java.util.ArrayList;

public class Test5 
{
		public static void main(String[] args) 
		{
			// Integer type ArrayList
			ArrayList<Integer> al = new ArrayList<Integer>();
			
			// will add 0-9 numbers to ArrayList
			for(int i=0;i<10;i++) 
			{
				al.add(i);
			}
			// Will print ArrayList
			for(int str: al)
				System.out.print(str+" ");
		}
	}