package com.vikram.abstraction;

public class Test extends Car {
	
	String brand;
	String  model;
	int mileage;
	int top_speed;
	int yearOfManufacturing;
	
	
	
	public Test(String brand, String model, int mileage, int top_speed, int yearOfManufacturing) {
		super();
		this.brand = brand;
		this.model = model;
		this.mileage = mileage;
		this.top_speed = top_speed;
		this.yearOfManufacturing = yearOfManufacturing;
	}
	
	
	@Override
	public String carBrand() {
		// TODO Auto-generated method stub
		return this.brand;
	}
	@Override
	public int carMileage() {
		// TODO Auto-generated method stub
		return this.mileage;
	}
	@Override
	public String carModel() {
		// TODO Auto-generated method stub
		return this.model;
	}
	@Override
	public int carTopSpeed() {
		// TODO Auto-generated method stub
		return top_speed;
	}
	@Override
	public int carYear() {
		// TODO Auto-generated method stub
		return yearOfManufacturing;
	}


	@Override
	public void display() {
		System.out.println("\ncarBrand = " + carBrand() + ", \ncarMileage = " + carMileage() + ", \ncarModel = " + carModel()
		+ ", \ncarTopSpeed = " + carTopSpeed() + ", \ncarYear = " + carYear() + "\n"); ;
	}
	
	

}
