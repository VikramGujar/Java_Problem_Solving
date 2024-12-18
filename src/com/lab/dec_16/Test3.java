package com.lab.dec_16;

class Test_3 extends Thread
{
	int a;
	public void run() {
		a++;
	}
}
public class Test3
{
	public static void main(String[] args) {
		Test_3 test = new Test_3();
		test.run();
		System.out.println(test.a);
		test.start();
		System.out.println(test.a);
		System.out.println(test.isAlive());
		System.out.println(test.getName());		
	}
}
// 1
// 1
// true
// Thread-0