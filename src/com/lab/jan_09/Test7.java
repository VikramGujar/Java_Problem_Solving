package com.lab.jan_09;


import java.util.*;
public class Test7
{
	private String a;
	public Test7(String a) 
	{
	this.a = a; 
	}
	public static void main(String[] args) 
	{
	HashSet<Object> hash = new HashSet<Object>();
	Test7 ms1 = new Test7("MarutiCurvo");
	Test7 ms2 = new Test7("MarutiCurvo");
	String a1 = new String("MarutiCurvo");
	String a2 = new String("MarutiCurvo");
	hash.add(ms1); 
	hash.add(ms2); 
	hash.add(a1); 
	hash.add(a2);
	System.out.println(hash.size()); 
    }
}