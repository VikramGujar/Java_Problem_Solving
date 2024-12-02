package com.lab.dec_02;

interface NIT16
{
	String myInterface();
}
public class Java8_16 {
	public static void main(String[] args) {
		NIT16 nit = () -> {return "NareshITechnologies";};
		System.out.println(nit.myInterface());
		// Output : NareshITechnologies
	}
}