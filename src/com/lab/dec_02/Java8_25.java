package com.lab.dec_02;

interface Calculate
{
	int myinterface(int a, int b);
}

interface NIT25
{
	String myInterface(String a);
}
public class Java8_25 {
	public static void main(String[] args) {
//		Calculate cal = (a) -> a+5;	[ Error ]
//		Lambda expression's signature does not match the signature of the functional interface method myinterface(int, int)
//		cal.myinterface(1, 5);
//		NIT25 nit = (a) -> {return a;};
//		System.out.println(nit.myInterface("NIT"));
	}
}

// In the above example 
// given abstract method in functional interface is having two parametrs of int type
// But the lambada expression written by user is having just ine parametr
// Thats why Error occured
// Lambada expression's signature does not match the signature 
// of the functional interface method myinterface(int, int)
