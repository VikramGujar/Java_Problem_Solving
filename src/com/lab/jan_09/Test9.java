package com.lab.jan_09;

import java.util.*;

public class Test9 
{
	public static void main(String[] args) {
    NavigableSet<Integer> set = new TreeSet<Integer>();
    set.add(-12);
    set.add(24);
    System.out.format("%d %d %d %d",
        set.lower(-12),
        set.lower(0),
        set.lower(24),
        set.lower(100)
    );
}
}