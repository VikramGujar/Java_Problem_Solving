package com.lab.feb_04;

import java.util.*;
import java.util.stream.Collectors;

public class ToSingleTist 
{

	public static void main(String[] args) 
	{
		List<List<Integer>> numArr = new ArrayList<List<Integer>>();
		
		numArr.add(List.of(1,2,3));
		numArr.add(List.of(2,3,4,5));
		numArr.add(List.of(4,5,6));
		
		List<Integer> fullList = numArr.stream().flatMap(num -> num.stream()).distinct().collect(Collectors.toList());

		System.out.println(fullList);
	}

}

/*
Ques - 3
---------------
Flattening Lists:
Given a list of lists of integers, flatten it into a 
single list and then remove duplicates using Java 8 streams.

Input:
List<List<Integer>> = [[1,2,3],[2,3,4,5],[4,5,6]]
Expected Output:
Flattened List without Duplicates:
1
2
3
4
5
6
*/