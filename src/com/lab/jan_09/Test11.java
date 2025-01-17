package com.lab.jan_09;


import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test11 
{
      public static void main(String[] argv) 
      {
    	  // default object type TreeSet created
            Set set = new TreeSet();
            set.add("2");
            set.add(3);	// Class cast exception
            set.add("1");
            Iterator it = set.iterator();
            while (it.hasNext())
                 System.out.print(it.next() + " ");
      }
}