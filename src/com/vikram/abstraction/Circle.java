package com.vikram.abstraction;

public class Circle extends Shape {

	double radius;
	
	
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return 3.14*radius*radius;
	}

	@Override
	public String printDetails() {
		return "Type = Circle \n"+"Radius = "+this.radius+"\nArea ="+getArea()+"\n\n";
	}
}
