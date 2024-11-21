package com.vikram.abstraction;

public class Rectangle extends Shape {
	
	double length;
	double breadth;
	
	
	
	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public double getArea() {
		return length * breadth;
	}

	@Override
	public String printDetails() {
		
		return "Type = Rectangle \n"+"Length = "+"\nBreadth = "+"\nArea = "+getArea()+"\n\n";
	}
	
}
