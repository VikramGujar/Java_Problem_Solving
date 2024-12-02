package com.lab.dec_02;

interface NIT5
{
	public int myInterface(int a);
}

public class Java8_5 {

	public static void main(String[] args) {
		
			NIT5 nit = (a) -> a+1;
			System.out.println(nit.myInterface(5));
	}

}

/*
	this will compile successfully 
	and print [ 6 ] on console
	myInterface is a functional interface couse it is having only one abstract method
	And in java we can write lambada expression in functional interface
*/