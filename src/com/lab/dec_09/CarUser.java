package com.lab.dec_09;


@SuppressWarnings("serial")
class CarStoppedException extends Exception
{
	public CarStoppedException() 
	{
		
	}
	public CarStoppedException(String erorrMassage) 
	{
		super(erorrMassage);
	}
}



@SuppressWarnings("serial")
class CarPunctureException extends Exception
{
	public CarPunctureException() 
	{
		
	}
	public CarPunctureException(String erorrMassage) 
	{
		super(erorrMassage);
	}
}

@SuppressWarnings("serial")
class CarHeatException extends Exception
{
	public CarHeatException() 
	{
		
	}
	public CarHeatException(String erorrMassage) 
	{
		super(erorrMassage);
	}
}

class CarTest
{
	
	public static void stop(String carCondition) {
		if(carCondition == "stop") {
			
			try {
				
				throw new CarStoppedException("Car Stopped due to unknown reason");
				
			} catch (Exception e) {
				System.out.println(e);
				System.err.println(e.getMessage());
			}
			
		}else {
			System.out.println("Car not started");
		}
		
	}
	public static void puncture(String carCondition) {
		
		if(carCondition == "puncture") {
			
			try {
				
				throw new CarPunctureException("Car Stopped due to Puncture !");
				
			} catch (Exception e) {
				System.out.println(e);
				System.err.println(e.getMessage());
			}
			
		}else {
			System.out.println("Car not puncture");
		}
	}
	
	public static void carHeat(int carTemprature) {
		
		if(carTemprature > 50 ) {
			try {
				throw new CarHeatException("Car is heated more the 50 degrees !");
			} catch (Exception e) {
				System.out.println(e);
				System.err.println(e.getMessage());
			}
		}else {
			System.out.println("Car heat less that 50 degrees");
		}
	}
}

public class CarUser {

	public static void main(String[] args) {
		
		System.out.println("======================================");
		CarTest.stop("go");
		System.out.println("======================================\n\n");
		
		System.out.println("======================================");
		CarTest.puncture("move");
		System.out.println("======================================\n\n");
		
		System.out.println("======================================");
		CarTest.carHeat(11);
		System.out.println("======================================");

	}

}
