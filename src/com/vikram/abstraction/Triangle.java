package com.vikram.abstraction;

public class Triangle extends Shape {

	double base;
	double height;
	
	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}

	@Override
	public double getArea() {
		
		return 0.5 * base * height;
	}

	@Override
	public String printDetails() {
		
		return "Type = Triangle\n"+"Base = \n"+this.base+"Height = "+this.height+"\nArea = "+getArea()+"\n\n";
	}

}
