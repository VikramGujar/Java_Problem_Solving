package com.lab.dec_05;

public class ArrayIndexExceptionDemo {

	public static void main(String[] args) {
		
		try {
			int a[] = new int[2];
			System.out.println(a[3]);
			
		} catch (Exception e) {
			System.err.println("Index 3 out of bounds for length 2");
			System.out.println(e);
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}

}
