package com.lab.dec_11;

public class ShoppingCart {
	
	private Product [] cartItems;
	//to store items in the cart.
	private int itemCount;
	//An integer representing the number of items in the cart.
	
	
	public ShoppingCart(int capacity) {
		super();
		this.cartItems = new Product[capacity];
		
	}
	
	
	
//	Adds the product to the cart or updates its quantity.
//	Throws InsufficientQuantityException if the requested quantity is not available, 
//	or InvalidProductException if the product is not found.
	public void addToCart(Product p, int quantity) throws InsufficientQuantityException , InvalidProductExceptionextends
	{
		
		if(p == null)
		{
			throw new InvalidProductExceptionextends("Invalid product");
		}
		if(quantity > p.getQuantity())
		{
			throw new InsufficientQuantityException("Quantity is Insufficient");
		}
		
		while(quantity!=0) {
			cartItems [itemCount++] = p;
			quantity--;
		}
		
		p.decreaseQuantity(quantity);
	}
	
	
//	Calculates and returns the total price of all items in the cart.
	public double calculateTotal()
	{
		double total = 0.0;
		for(Product product : cartItems)
		{
			if(product!=null)
			total = product.getPrice() * product.getQuantity();
		}
		return total;
	}

}
