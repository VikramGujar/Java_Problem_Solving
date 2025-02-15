package com.assignment.task;
import java.util.*;

import java.util.Scanner;

public class PrintTable 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to print table :");
		int num = Integer.parseInt(sc.nextLine());
		
		printTable(num);
		
		

	}
	
	
	public static void printTable (int num)
	{
		if(num<=0)
		{
			System.err.println("Number should be positive and non zero");
		}else 
		{
		  for(int i=1; i<=10; i++)
		  {
			  System.out.println(i*num);
		  }
			
		}
	}

}
