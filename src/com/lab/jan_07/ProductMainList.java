package com.lab.jan_07;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ProductMainList 
{

	public static void main(String[] args) 
	{
		ArrayList<Product> productList = new ArrayList<Product>();
		productList.add(new Product(1, "Phone", 10000.00));
		productList.add(new Product(2, "Watch", 20000.00));
		productList.add(new Product(3, "Fan", 30000.00));
		productList.add(new Product(4, "Car", 40000.00));
		productList.add(new Product(5, "Bike", 50000.00));
		
		Collections.sort(productList);
		productList.forEach(System.out::println);
		
		

	}

}
