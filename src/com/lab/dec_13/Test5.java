package com.lab.dec_13;

public class Test5 extends Thread {

    public static void main(String[] args) throws Exception {
    Test5 t = new Test5();	// Creating object for Test5
    t.start();	// This may take some time to get separate stack Call run()
    t.method();	// Call method() 
    }

    public void run() {
    System.out.println("run");
    }

    public void method() {
	hello();	// Call hello()
    System.out.println("method");
}

public void hello()
	{
	hello1();	// Call hello1()
	System.out.println("PR");
	}

	public void hello1()
	{
	
	System.out.println("RR");
	}
}

/**
 * Output :	
 * 			RR
 * 			PR
 * 			method
 * 			run
 */

