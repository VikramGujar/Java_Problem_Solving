package com.lab.jan_28;

import java.util.Arrays;

class NareshIT1<T>
{
	private T test;
	
	public void set(T test)
	{
		this.test = test;
	}
	public T get()
	 {
		 return test;
	 }
}
public class Test1 
{
  public static void main(String[] args) 
  {
     NareshIT1<Integer> nit = new NareshIT1();
		nit.set(10);
		System.out.println(nit.get());
   }
}