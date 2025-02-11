package com.assignment.task;

public class StringCompressionAlgorithm 
{

	public static void main(String[] args) 
	{
		String str = "aaabbccccd";
	    StringBuffer sb = new StringBuffer(str); // Converted to String Buffer
		
		
		for(int i=0; i<sb.length(); i++)
		{
			int count = 1;
			
			for(int j=i+1; j<sb.length()-1; j++)
			{
				if(sb.charAt(i) ==sb.charAt(j))
				{
					sb.deleteCharAt(j);	// Delete duplicate
					count++;	// Count number of duplicate
					j--;
				}
			}
			if(count != 1)
			{
				System.out.print(sb.charAt(i)+""+count);	// Printing character plus Count
			}else
			{
				System.out.print(sb.charAt(i));
			}
			
		}
		if(str.length() == sb.length())	// Checking if size reduced or not
		{
			System.out.print(" (Since compression doesn't reduce size)");
		}

	}

}
/*
Task 3: String Compression Algorithm

Problem:
Write a program that takes a string as input and compresses it using the following rule:

Consecutive repeated characters are replaced with a single character followed by the count.
If the compressed version is not smaller than the original, return the original string.
Sample Test Case:

I/P: "aaabbccccd"

O/P: "a3b2c4d1"

I/P: "abcde"

O/P: "abcde" (Since compression doesn't reduce size)
*/