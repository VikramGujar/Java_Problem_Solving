package com.lab.jan_09;

import java.util.*;

public class Test2 
{
       public static void main(String[] args) 
       {
            TreeSet<Integer> times = new TreeSet<Integer>();
            times.add(705);
            times.add(509);
            times.add(645);
            times.add(830);
            times.add(1010);
            times.add(1100);    
            TreeSet<Integer> subset = new TreeSet<Integer>();
            
            /*
             * headSet method return type is SortedSet<T>
             * and we are trying to store in TreeSet<T>
             * Type mismatch: cannot convert from SortedSet<Integer> to TreeSet<Integer>
             * Compilation error will come
             */
            //subset = times.headSet(800);	
            
            System.out.println(subset);
            System.out.println(subset.first());
            System.out.println(subset.last());
            
       }
}