package com.exception.customException;

//Thrown when a product is not found in the inventory.
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