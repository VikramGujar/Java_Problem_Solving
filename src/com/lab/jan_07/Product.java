package com.lab.jan_07;

public record Product(Integer productNumber, String productName, Double productPrice) implements Comparable<Product>
{

	@Override
	public int compareTo(Product p2) 
	{
		return this.productName().compareTo(p2.productName());
	}
	
}
/*
Program 1:
------------
Write a Program to perform sorting operation on 
Product class using ArrayList by implementing Comparable interface.

Create a BLC class Product.

Instance variables:
productNumber-private-Integer
productName-private-String
productPrice-private-Double

Create a parameterized constructor to initialize the 
instance variable of Product class.

Implement Comparable interface to write the logic to sort 
the Product class based on the Product Name.

Create an ELC class which contains main method, create ArrayList object to hold Product data as well as sort the product data object based on the product name.

*/