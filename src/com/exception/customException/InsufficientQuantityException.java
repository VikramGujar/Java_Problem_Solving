package com.exception.customException;

//Thrown when the requested quantity of a product is not available.
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