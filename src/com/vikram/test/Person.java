package com.vikram.test;

public class Person {

	String name;
	int age;
	
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void displayInfo() {
		System.out.println("Age "+this.age+"Name"+this.name);
	}
}
