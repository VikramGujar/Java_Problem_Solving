package com.lab.dec_02;

interface NIT24
{
	String myInterface(String a);
}
public class Java8_24 {
	public static void main(String[] args) {
		NIT24 nit = (a) -> {return a;};	// Returns given string
		System.out.println(nit.myInterface("NIT"));	// NIT
		//	Output : NIT
	}
}