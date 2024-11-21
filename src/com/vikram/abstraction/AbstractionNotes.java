package com.vikram.abstraction;

public class AbstractionNotes {

	
	/* 
	  
	  	Abstraction in Java (Hiding Complexity)
	  	Abstraction means showing only the essential details 
	  	of an object and hiding its background details.

		How to Achieve Abstraction:
		Abstract Class: Allows 0% to 100% abstraction.
		Interface: Allows 100% abstraction.
		
		
		
		Abstract Class and Abstract Methods:
		
		Abstract Class: A class that provides partial implementation (not complete).
		Abstract Method: A method declared without a body to make it easier for programmers to use.
		
		
		How to Identify an Abstract Method:
		
		Contains the abstract keyword.
		Has no body (only declaration).
		Ends with a semicolon (;).
		When to Use Abstract Methods:
		When an action is common, but the implementation varies for different subclasses.
		Abstract methods are usually declared in the parent class and must be implemented in the child classes.

	  
	  
	  	Rules for Abstract Classes and Methods:
	  	
		If a class has at least one abstract method, 
		it must be declared as an abstract class.
		An abstract class cannot be instantiated (no objects can be created).
		All abstract methods in the parent class must be implemented in the child class, 
		or the child class will also become abstract.
		
		
		
		Abstract classes can have:
		
		All abstract methods.
		All concrete (non-abstract) methods.
		A combination of both.
		An abstract class may or may not contain abstract methods.
		An abstract method must be inside an abstract class.



		What You Cannot Do with Abstract Methods:
		
		Cannot declare an abstract method as final, static, or private.
		(Error: Illegal combination of modifiers)
		
		
		
		
		Key Notes on Abstract Classes:
		Constructor in Abstract Classes:
		An abstract class can have constructors, 
		and these constructors will execute when a subclass object is created (using super)
	
	  
	  
	  
	  	Example:
		Abstract Class and Abstract Method:
		
		abstract class Animal 
		{  
    		abstract void sound(); // Abstract method (no body)  
    		void eat() {           // Concrete method (has body)  
        	System.out.println("This animal eats food.");
    		}  
		}  

		class Dog extends Animal {  
    		void sound() {  
        	System.out.println("Dog barks.");
    		}  
		}  

		public class Main {  
    		public static void main(String[] args) {  
        	Animal dog = new Dog();  
        	dog.sound();  // Calls abstract method implementation  
        	dog.eat();    // Calls concrete method  
    		}  
		}


	  	Key Points from the Example:
	  	
		Animal is an abstract class.
		sound() is an abstract method implemented in Dog.
		eat() is a concrete method that doesn't need overriding.
		This makes abstraction clearer and simpler for programmers.
	  
	  
	  
	 */
}
