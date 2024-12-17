package com.lab.dec_13;

/**
 * Write a program in java to show the drawback of Multithreading 
 * by booking Railway Reservation System.
 * In this scenario, only 1 seat is available 
 * and two threads are accessing this seat to book the ticket.
 * Write a Program to show that both the thread will get the ticket.
 */

class RailwayReservation extends Thread{
	private int availableSeat = 1;
	private int wantedSeat;  
	   
	public RailwayReservation(int wantedSeat) 
	{
	  super();
	  this.wantedSeat = wantedSeat;
    }
	
	@Override
	public void run() 
	{
		String name = null;	
		
		if(availableSeat >= wantedSeat)
		{
			name = Thread.currentThread().getName();
			System.out.println(wantedSeat+" seat is reserved for "+name);
			availableSeat = availableSeat - wantedSeat;			
		}
		else
		{
			name = Thread.currentThread().getName();
			System.err.println("Sorry!!"+name+" seat is not available");
		}
		
		
	}
	
}
public class DrawbackOfMultithreading {

	public static void main(String[] args) {
		
		RailwayReservation rr = new RailwayReservation(1);
		
		Thread th1 = new Thread(rr,"Vikram");
		Thread th2 = new Thread(rr,"Harun");
		
		th1.start();
		th2.start();
	}
}
