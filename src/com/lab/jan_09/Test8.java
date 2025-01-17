package com.lab.jan_09;

import java.util.*;

public class  Test8
{
	public static void main(String[] args) {
    SortedSet<Integer> set = new TreeSet<Integer>();
    set.add(7);
    set.add(-12);
    SortedSet<Integer> sub = set.subSet(-100, 100);
    sub.add(9);
    System.out.format("%d %d", set.size(), sub.size());
}
}