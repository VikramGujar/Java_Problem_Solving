package com.lab.dec_03;


import java.util.Scanner;
import java.util.function.Predicate;


public class NumberTester {
	
public static void main(String[] args) {
	
	Predicate<Integer> isEven = num -> num%2==0; 
	Predicate<Integer> isPrime = num -> {
		for(int i=2;i<num/2;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	};
	System.out.println("Enter a number to Check Even & Prime");
	Scanner sc = new Scanner(System.in);
	int number = sc.nextInt();
	
	System.out.println("Is "+number+" Even? "+ testPredicate(number, isEven));
	System.out.println("Is "+number+" Prime? "+ testPredicate(number, isPrime));
	
	sc.close();		
	
}
	public static boolean testPredicate(int num, Predicate<Integer> pd) {
	return pd.test(num);
}

}
