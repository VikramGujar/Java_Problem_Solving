package com.lab.jan_09;


import java.util.TreeSet;

public class Test4
{
       public static void main(String[] args) 
       {
            TreeSet<Integer> times = new TreeSet<Integer>();
            times.add(1205);
            times.add(1505);
            times.add(1545);
            times.add(1830);
            times.add(2010);
            times.add(2100);
            // times = [ 1205 1505 1545 1830 2010 2100 ]
            
            // new TreeSet named subset created 
            TreeSet<Integer> subset = new TreeSet<Integer>();
            
            // type cast because headSet return SortedSet
            // headSet will return the values that are smaller than parameter
            // Here [ 1205 1505 1545 ] are lower than 1600
            subset = (TreeSet) times.headSet(1600);
            
            // ToString method will print elements inside []
            System.out.println(subset); // [ 1205 1505 1545 ]
            
            // first method will return first element
            System.out.println(subset.first());//1205
            
            // last method will return last element 
            System.out.println(subset.last());//1545
            
            // lower will return element which is smaller than parameter
            System.out.println(subset.lower(1500));//1205
            
            // higher will return the element bigger than 1505
            System.out.println(subset.higher(1500));//1505
       }
}