package com.lab.dec_30;
import java.util.*;

public class Test3 
{
	 public static void main(String args[]) 
	 {
	 Vector obj = new Vector(4,2);
	 
	 obj.addElement(new Integer(3));
	 obj.addElement(new Integer(2));
	 obj.addElement(new Integer(6));
	 
	 // Here we are inserting element 8 at position 2
	 obj.insertElementAt(new Integer(8), 2);
	 
	 // This will print toString method of Vector class
	 // [ 3, 2, 8, 6 ]
	 System.out.println(obj);
	 }
	 
}