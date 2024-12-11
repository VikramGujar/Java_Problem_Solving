package com.lab.dec_11;


public class ShoppingApplication {

	public static void main(String[] args) {
		
		Product Bat = new Product(101,"MRF Bat", 600, 10);
		
		
		
		ShoppingCart shopCapacity = new ShoppingCart(10);
		
		try 
		{
			shopCapacity.addToCart(Bat, 3);
		}catch (Exception e) 
		{
			System.out.println(e);
		}
		System.out.println("The total prise of items in a cart is : "+shopCapacity.calculateTotal());


	}

}
