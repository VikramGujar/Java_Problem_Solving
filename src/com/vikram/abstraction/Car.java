package com.vikram.abstraction;

public abstract class Car {
			
			public Car() {
				super();
			}
			
			public abstract String carBrand();
			public abstract String carModel();
			public abstract int carYear();
			public abstract int carMileage();
			public abstract int carTopSpeed();
			public abstract void display();
					
}
