package com.lab.jan_09;

import java.util.Iterator;
import java.util.TreeSet;

public class Test3 
{
      public static void main(String[] argv) 
      {
           TreeSet set = new TreeSet();
           for (int i = 0; i < 5; i++)
                set.add(Math.random()); 
           // math class random method will generate random numbers 
           // every time and then it will be store in set

           Iterator iter = set.iterator(); // change to iterator
           while (iter.hasNext())
                System.out.println(iter.next());
           // 5 random numbers from 0 to 0.99

     }
}