package com.lab.dec_19;

public class ATMMachine {

	public static void main(String[] args) {
		
		Account  ac = new Account(1000);
		Drawer dr = new Drawer(ac);
		Depositor dp = new Depositor(ac);
		dr.start();
		dp.start();
		

	}

}
