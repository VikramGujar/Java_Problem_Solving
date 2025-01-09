package com.lab.jan_07;

import java.util.ArrayList;
import java.util.Collections;

public class CustomerList 
{

	public static void main(String[] args) 
	{
		ArrayList<Customer> cust = new ArrayList<Customer>();
		cust.add(new Customer(115, "Satya", 800.00));
		cust.add(new Customer(112, "Rohit", 500.00));
		cust.add(new Customer(113, "Deva", 600.00));
		cust.add(new Customer(111, "Mohit", 400.00));
		cust.add(new Customer(114, "Ram", 700.00));
		
		
		System.out.println("=============== Original Data ===============");
		cust.forEach(System.out::println);
		
		System.out.println("\n\n========== Sorted on ID Data ===========");
		Collections.sort(cust,(c1,c2)->c1.customerNumber().compareTo(c2.customerNumber()));
		cust.forEach(System.out::println);
		
		System.out.println("\n\n========== Sorted on NAME Data ===========");
		Collections.sort(cust,(c1,c2)->c1.customerName().compareTo(c2.customerName()));
		cust.forEach(System.out::println);
		
		System.out.println("\n\n========== Sorted on BILL Data ===========");
		Collections.sort(cust,(c1,c2)->c1.customerBill().compareTo(c2.customerBill()));
		cust.forEach(System.out::println);
		
	}

}
