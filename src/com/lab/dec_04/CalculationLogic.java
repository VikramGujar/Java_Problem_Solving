package com.lab.dec_04;

import java.util.function.Predicate;

public class CalculationLogic {

	public static void main(String[] args) {
		
		int n=17;
		Predicate<Integer> isEven = (num) -> num%2==0;
		Predicate<Integer> isGreaterThanTen = (num) -> num>10;
		Predicate<Integer> isPrime = (num) -> {
			for(int i=2;i<num/2;i++) {
				if(num%i==0)
				{
					return false;
				}
			}
			return true;
		};
		System.out.println(n+" is Even :"+Test(n,isEven));
		System.out.println(n+" is Grater than 10 :"+Test(n,isGreaterThanTen));
		System.out.println(n+" is Prime :"+Test(n, isPrime));
		
		
	}
	
	
	public static boolean Test (int n, Predicate<Integer> p) {
		return p.test(n);
	}
}
