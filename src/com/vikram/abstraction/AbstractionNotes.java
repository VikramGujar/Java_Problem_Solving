package com.vikram.abstraction;

public class AbstractionNotes {

	
	/* 
	 
	 Abstraction [Hiding Complexity]
	  
	 Showing essential details without showing background details is called Abstraction
	 
	 	There are two concepts to achieve abstraction :
		
		1. Abstract class [We can achieve 0% to 100%  abstraction]
		2. Interface [ We can achieve 100 % abstraction ]
		
		
	Abstract class and abstract methods :
	
	A class that dose not provide complete implementation 
	(Partial implementation) is defined as an abstract class.
	An abstract method is a common method.
	which is used to provide easiness to programmer 
	because the programmer faces complexity to remember the method names.
	  
	  
	  
	How to recognize abstract method ?

	An abstract method contains abstract keyword.
	Abstract method dose not contains any method body.
	At the end there must be a terminator ( ; ) ( Semicolon )



	When you should use Abstract method ? 

	In java, whenever action is common but 
	implementation are different then we should use abstract method. 
	Generally we declare abstract method in the super class.
	Its implementation must be provided in the sub classes.



	If a class contains at least one method as an abstract method
	then we should compulsory declare that class as an abstract class.
	Once a class is declared as an abstract class we can not create an object for that class.
	All the abstract method in the super class must be overridden in the sub classes.
	Otherwise the sub class will become an abstract class.
	And as an abstract class we can not create an object for that class as well.




	In an Abstract Class we can write All Abstract method.
	We can write All Concrete method.
	We can write Combination of both.
	It is used to achieve partial abstraction
	that means by using abstraction classes 
	we can achieve partial abstraction [  0 to 100%  Abstraction ]



	An abstract class may or may not contain abstract method
	But an Abstract method must have abstract class



	Note : We can not declare an abstract method as final, static and private 
		   [ Error : Illegal combination of modifiers ]


	Note : Any constructor of abstract class will also be executed
	 	   with sub class object using super keyword.
	  
	  
	  
	  
	 */
}
