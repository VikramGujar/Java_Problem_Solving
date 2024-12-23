package com.lab.dec_23;

public class Bakery 
{

	private int goodsAvailable;		//The current number of goods available for purchase.
	private final int MAX_GOODS_PER_DAY = 100;	//The maximum number of goods that can be produced in a day (set to 100).
	private int goodsProducedToday;		//The total number of goods produced so far today.

	
	
	
	public Bakery(int goodsAvailable, int goodsProducedToday) 
	{
		super();
		this.goodsAvailable = goodsAvailable;
		this.goodsProducedToday = goodsProducedToday;
	}


	/*
	 * If number of goods are available then Baker will not produced new goods, 
	 * It will be in wait mode (Using wait() method).
	 * Every time Baker will bake 10 goods in one attempt, 
	 * These 10 goods will be added in total number of goods produced today 
	 * as well as we need to verify goodsProducedToday < MAX_GOODS_PER_DAY.
	 * After baking 10 goods, it should notify all waiting threads that goods are available.
	 */
	
	public synchronized void bakeGoods()
	{
		if(goodsAvailable > 0)
		{
			System.out.println("Wait goods are available");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else
		{
			goodsAvailable = goodsAvailable + 10;
			System.out.println("10 goods baked");
			goodsProducedToday = goodsProducedToday + 10;
			if(goodsProducedToday<MAX_GOODS_PER_DAY)
			System.out.println("Total goods produced today are :"+goodsProducedToday);
			else
				System.out.println("Good production for today is over!");
			
		}
		
		
		
	}
	
	public int getGoodsAvailable() {
		return goodsAvailable;
	}
	
	public int getMAX_GOODS_PER_DAY() {
		return MAX_GOODS_PER_DAY;
	}

	public int getGoodsProducedToday() {
		return goodsProducedToday;
	}

	/**
	 * Allows a customer to buy a good if available.
	 * If no goods are available, 
	 * the method customer should wait until goods are available or the production is over.
	 * After a customer buys a good, if the bakery becomes empty, 
	 * notify the baker to bake more goods.
	 */
	public synchronized void buyGoods(String customerName)
	{
		goodsAvailable = goodsAvailable - 10;
		System.out.println(customerName+" bought 10 goods available goods are "+goodsAvailable);
		notify();
		
	}
	
	
	
	/**
	 * It will verify and return that goodsProducedToday >= MAX_GOODS_PER_DAY 
	 * and goodsAvailable is 0
	 */
	public boolean isProductionFinished()
	{
		if(goodsProducedToday == MAX_GOODS_PER_DAY && goodsAvailable==0)
			return true;
		else
			return false;
	}
	
}

/**
 * 
 
Stream
Java Multithreading Bakery Simulation
=============================================
You are tasked with simulating a simple bakery operation using Java multithreading. In this bakery, there is one baker who bakes goods and multiple customers who buy the goods.

You need to ensure that:
The bakery can only produce up to 100 goods per day (Maximum Limit).
The baker bakes goods only when the bakery is empty.
Customers wait if there are no goods available to buy.
Multiple customers can buy goods concurrently.
The program should stop automatically when the daily production limit is reached and all goods have been sold.


*/
