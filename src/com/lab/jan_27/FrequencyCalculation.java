package com.lab.jan_27;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCalculation 
{

	public static void main(String[] args) 
	{
		String str = "Hello World";
		Map<Character, Integer> Characters = new HashMap<>();
		
		for(int i=0; i<str.length(); i++)
		{
			int count = 1;
			for(int j=i+1; j<str.length()-1; j++)
			{
				if(str.charAt(i)==str.charAt(j) && str.charAt(i)>65)
				{
				count++;
				
				}
				
			}
			if(str.charAt(i)>65)
			Characters.putIfAbsent(str.charAt(i), count);
		}
		
		Characters.forEach((k,v)->System.out.println("Key :"+k+" Value :"+v+""));
		
	}
}
/*
Character Frequency Calculation Using Map implemented classes:
Write a Java program to calculate the frequency of each character in a given string. 
You are required to use a HashMap to store each character as a key and 
its frequency as the corresponding value. 
Spaces and punctuation marks should be ignored in the frequency calculation.

Create a Java class CharacterFrequency(ELC) with a main method.
Inside the main method, initialize a String variable with a sample string.
Use a Map<Character, Integer> to store character frequencies.
Iterate through each character in the string:
Ignore spaces and non-alphanumeric characters using Character.isLetterOrDigit().
Update the frequency in the HashMap.

Constraints:
Ensure that the program handles edge cases such as:
An empty string.
Strings with only spaces or punctuation marks.
Strings with mixed case characters.

Test Case 1:
Input: "Hello, World!"
Expected Output:
Character frequencies in the string 'Hello, World!':
'H' occurs 1 times
'e' occurs 1 times
'l' occurs 3 times
'o' occurs 2 times
'w' occurs 1 times
'r' occurs 1 times
'd' occurs 1 times

Test Case 2:
Input: "" (empty string)
Expected Output: (No output as there are no characters)

Test Case 3:
Input: "Java Programming"
Expected Output:
Character frequencies in the string 'Java Programming':
'j' occurs 1 times
'a' occurs 3 times
'v' occurs 1 times
'p' occurs 1 times
'r' occurs 2 times
'o' occurs 2 times
'g' occurs 2 times
'm' occurs 2 times
'i' occurs 1 times
'n' occurs 2 times

Test Case 4:
Input: " !@#$% "
Expected Output: (No output as there are no alphanumeric characters)
*/