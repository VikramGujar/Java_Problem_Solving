package com.lab.jan_09;

import java.util.*;
public class Test10
{
    public static void main(String[] args) 
    {
    NavigableSet<Integer> set = new TreeSet<Integer>();
    set.add(1);
    set.add(2);
    set.add(4);
    for (Iterator iterator = set.descendingSet().iterator();
        iterator.hasNext();) {
        System.out.format("%d ", iterator.next());
    }
}
}