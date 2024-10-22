package com.vikram.basic;

//How to convert a String value into integer 

public class ConvertStringToInteger {

	public static void main(String[] args) {
		
//		In java.lang package, there is a predefined class called Integer,
//		this Integer class contains a predefined static 
//		method called pareInt(String x). This parseInt(String x) 
//		method accept String as a parameter and return type is int.
		
		String num = "1234";
		int newNum = Integer.parseInt(num);
		System.out.println(newNum+1);

	}

}
