package com.lab.dec_02;

interface NIT26
{
	String myInterface(String a);
}
public class Java8_26 {
	
	private void operation(int a, int b, Calculate cal) 
	{
		System.out.println(cal.myinterface(a, b));
		// On first call print 6
		// On second call print 0
	}
	
	public static void main(String[] args) {
		Java8_26 java = new Java8_26();
		Calculate cal = (a,b) -> a+b;	
		java.operation(1, 5, cal);	// return 6
		cal = (a,b) -> a*b;
		java.operation(17, 0, cal);
		NIT26 nit = (a) -> {return a;};
		System.out.println(nit.myInterface("NIT"));
		// Print NIT
	}
}
// Output 
// 6
// 0
// NIT



