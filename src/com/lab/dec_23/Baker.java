package com.lab.dec_23;

public class Baker implements Runnable
{
	Bakery bakery;
	
	

	public Baker(Bakery bakery) {
		super();
		this.bakery = bakery;
	}

	/**
	 * Repeatedly calls the bakeGoods() 
	 * method in a loop until the daily 
	 * production limit is reached (isProductionFinished())
	 */

	@Override
	public void run() 
	{
		while(bakery.getGoodsProducedToday() < bakery.getMAX_GOODS_PER_DAY())
		{
			bakery.bakeGoods();
		}
		
	}

}
