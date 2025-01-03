package com.lab.dec_31;

import java.util.ArrayList;
import java.util.Collection;

public class Test11
{
     public static void main(String[] argv) 
     {
           Collection c = new ArrayList(); // Arraylist object creation
           c.add("1");
           c.add("2");
           c.add("3");
           
           Collection c1 = new ArrayList(); // Another Arraylist object creation
           c1.add("1");
           
           // retainAll method will compare both c and c1 elements
           // and c will hold the elements that are smiler
           c.retainAll(c1);	
           
           // will print [1]
           System.out.println(c);
     }
}

/*
 * 
 * List
 *   |
 *   |---> Vector
 *   |---> Stack
 *   |---> ArrayList
 *   |---> LinkList
 *  Set
 *   |
 *   |
 *   |
 *  Queue
 *   |
 *   |
 *   |
 * 
 * 
 */