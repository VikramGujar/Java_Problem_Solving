package com.lab.jan_09;

import java.util.Set;
import java.util.TreeSet;

public class Test1 
{
     public static void main(String[] a) 
     {
    	 /*If we are creating TreeSet of Class type then it is compulsory
    	  *to that class to extends from comparable interface
    	  *because TreeSet internally using campareTo method for sorting data.
    	  */
          Set<Apple> set = new TreeSet<Apple>();
          set.add(new Apple());
          set.add(new Apple());
          set.add(new Apple());
          // we are creating object by new keyword thats why every time 
          // new object will be created
          System.out.println(set);
          /*
           * java.lang.ClassCastException
           */
          
     }
}
class Apple 
{

}