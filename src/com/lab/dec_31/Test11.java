package com.lab.dec_31;

import java.util.ArrayList;
import java.util.Collection;

public class Test11
{
     public static void main(String[] argv) 
     {
           Collection c = new ArrayList();
           c.add("1");
           c.add("2");
           c.add("3");
           
           Collection c1 = new ArrayList();
           c1.add("1");
           c.retainAll(c1);
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