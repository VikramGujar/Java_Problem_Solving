package com.lab.dec_11;

@SuppressWarnings("serial")
class InsufficientQuantityException extends Exception
{
	public InsufficientQuantityException()
	{
		
	}
	public InsufficientQuantityException(String errMassage)
	{
		super(errMassage);
	}
}
//Thrown when the requested quantity of a product is not available.

@SuppressWarnings("serial")
class InvalidProductExceptionextends extends RuntimeException
{
	public InvalidProductExceptionextends()
	{
		
	}
	public InvalidProductExceptionextends(String errMassage)
	{
		super(errMassage);
	}
}
//Thrown when a product is not found in the inventory.


public class Product {
	private int id;			//representing the product's unique identifier.
	private String name;	//representing the product's name.
	private double price;	//representing the product's price.
	private int quantity;	//representing the available quantity of the product.
	
	
	public Product(int id, String name, double price, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	
	// Method decreaseQuantity()
	//Takes an integer amount as a parameter and decreases the product's quantity. 
	//Throws InsufficientQuantityException if the requested quantity is not available.
	public void decreaseQuantity(int amount) throws InsufficientQuantityException {
		if(quantity < amount) 
		{
			throw new InsufficientQuantityException("This much qauntity is not available");
		}
		quantity -= amount;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	

}
