package com.vikram.abstraction;

public class ShapeMain {

	public static void main(String[] args) {
		
		Shape sh = null;
		sh = new Circle(23.2);
		System.out.println(sh.printDetails());
		
		sh = new Rectangle(30.3, 45.4);
		System.out.println(sh.printDetails());
		
		sh = new Triangle(146.2, 40.0);
		System.out.println(sh.printDetails());
		
		
	}

}
