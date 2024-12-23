package com.lab.dec_20;

public class Test3 
{
	public static void main(String[] args) 
	{
		new Thread(()->System.out.println("Naresh I Technologies")).start();
    }
}
/*
 * We can use lambda only in functional interface
 * In the above program lambda is a run method called by Thread class method start()*/
