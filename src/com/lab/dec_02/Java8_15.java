package com.lab.dec_02;

interface NIT15
{
	String myInterface();
}
public class Java8_15 {
	public static void main(String[] args) {
		NIT15 nit = () -> {return "NareshITechnologies";};	
		// code will compile successfully 
		// But with no output  
	}
}
