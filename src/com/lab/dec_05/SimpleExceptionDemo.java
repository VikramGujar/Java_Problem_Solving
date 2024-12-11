package com.lab.dec_05;

import java.util.Scanner;

public class SimpleExceptionDemo {

	public static void main(String[] args) {

		@SuppressWarnings("unused")
		int a,b;
		try {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a value for a :");
			a=sc.nextInt();
			System.out.println("Enter a value for b :");
			b=sc.nextInt();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
		}
		
		
		
		

	}

}


