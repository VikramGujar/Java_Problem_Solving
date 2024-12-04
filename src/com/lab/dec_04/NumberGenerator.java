package com.lab.dec_04;

import java.util.Random;
import java.util.Scanner;

public class NumberGenerator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the minimum and maximum values for the range.");
		System.out.print("Enter the minimum value: ");
		int Min = sc.nextInt();
		System.out.print("Enter the maximum value: ");
		int Max = sc.nextInt();
		
		System.out.println("Random number is : "+generateRandomNumber(Min, Max));
		sc.close();

	}
	public static int generateRandomNumber(int min,int max) {
		Random rd = new Random();
		return rd.nextInt(min, max);
	}
}
