package com.lab.dec_23;

public class Customer implements Runnable 
{

	Bakery bakery;
	String customerName;
	
	public Customer(Bakery bakery, String customerName) 
	{
		super();
		this.bakery = bakery;
		this.customerName = customerName;
	}

	
	/**
	 *Repeatedly attempts to buy goods from the bakery 
	 *by calling the buyGoods() method.
	 *If no goods are available, the customer should wait until notified by the baker.
	 */
	@Override
	public void run() 
	{
		while((bakery.isProductionFinished())!=true)
		{
			if(bakery.getGoodsAvailable()<=0)
			{
				try 
				{
					Thread.sleep(500);
				} catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
			}
			bakery.buyGoods(customerName);	
		}
		
	}

}
