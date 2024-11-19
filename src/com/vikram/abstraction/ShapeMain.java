package com.vikram.abstraction;

public class ShapeMain {

	public static void main(String[] args) {
		
		Shape sh = null;
//		sh = new Rectangle();
		sh = new Circle();
//		sh = new Square();
		sh.draw();
	}

}
